package com.learn.hibernate.demo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.learn.hibernate.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("Starting transaction : ");
			session.beginTransaction();

			// Updating the existing records based on id
			System.out.println("Updating Student FirstName");

			int studentId = 2;
			Student myStudent = session.get(Student.class, studentId);
			myStudent.setFirstName("Atul");

			List<Student> theStudents = session.createQuery("from Student").getResultList();
			displayStudents(theStudents);

			// Updating email for all the students
			session.createQuery("update Student set email='abc@hotmail.com'").executeUpdate();

			session.getTransaction().commit();
			session.close();
			System.out.println("Update Done!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student student : theStudents) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getEmail());
		}
		System.out.println("\n");
	}

}
