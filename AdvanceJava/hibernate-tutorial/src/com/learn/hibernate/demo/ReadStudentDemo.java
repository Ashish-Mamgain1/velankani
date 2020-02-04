package com.learn.hibernate.demo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("Starting transaction : ");
			session.beginTransaction();

			// Retrieving data from the database

			System.out.println("Retrieving All the student Object :");
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			displayStudents(theStudents);

			System.out.println("Retrieving student based on firstName :");
			theStudents = session.createQuery("from Student s where s.firstName='Ashish'").getResultList();
			displayStudents(theStudents);

			System.out.println("Retrieving student based on lastName or firstName :");
			theStudents = (List<Student>) session
					.createQuery("from Student s where s.lastName='Mamgain' OR s.firstName='Atul'").getResultList();
			displayStudents(theStudents);

			System.out.println("Retrieving student based on email  using like  :");
			theStudents = (List<Student>) session.createQuery("from Student s where s.email like '%erma@gmail.com'")
					.getResultList();
			displayStudents(theStudents);

			System.out.println("Retriew Done!!!\n");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}
	
	
	private static void displayStudents(List<Student> theStudents) {
		for (Student student : theStudents) {
			System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " "
					+ student.getEmail()+" "+ student.getDateOfBirth());
		}
		System.out.println("\n");
	}

}
