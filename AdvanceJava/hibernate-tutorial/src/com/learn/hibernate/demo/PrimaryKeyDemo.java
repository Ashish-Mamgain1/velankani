package com.learn.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			/*
			 * System.out.println("Creating 3 Student Object : "); Student student1 = new
			 * Student("Atul", "Verma", "atul.verma@gmail.com"); Student student2 = new
			 * Student("Ankit", "Sharma", "ankit.sharma@gmail.com"); Student student3 = new
			 * Student("Arvind", "Shastri", "arvind.shastri@gmail.com");
			 */

			System.out.println("Starting transaction : ");
			session.beginTransaction();

			/*
			 * System.out.println("Saving the student Object : "); session.save(student1);
			 * session.save(student2); session.save(student3);
			 */

			System.out.println("Retrieving the student Object : \n");
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			displayStudents(theStudents);
			theStudents = session.createQuery("from Student s where s.firstName='Ashish'").getResultList();
			displayStudents(theStudents);
			theStudents = (List<Student>) session
					.createQuery("from Student s where s.lastName='Mamgain' OR s.firstName='Atul'").getResultList();
			displayStudents(theStudents);
			
			theStudents = (List<Student>) session
					.createQuery("from Student s where s.email like '%erma@gmail.com'").getResultList();

			displayStudents(theStudents);

			session.getTransaction().commit();
			System.out.println("Done!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		System.out.println("\n");
		for (Student student : theStudents) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getEmail());
		}
		System.out.println("\n");
	}

}
