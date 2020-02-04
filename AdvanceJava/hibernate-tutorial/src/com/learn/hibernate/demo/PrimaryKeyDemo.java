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
			System.out.println("Starting transaction : ");
			session.beginTransaction();

			// Creating Entries in the Database

			/*
			 * System.out.println("Creating 3 Student Object : "); Student student1 = new
			 * Student("Atul", "Verma", "atul.verma@gmail.com"); Student student2 = new
			 * Student("Ankit", "Sharma", "ankit.sharma@gmail.com"); Student student3 = new
			 * Student("Arvind", "Shastri", "arvind.shastri@gmail.com");
			 * 
			 * System.out.println("Saving the student Object : "); session1.save(student1);
			 * session1.save(student2); session1.save(student3);
			 * 
			 */

			// ***************************************************************************************************//

			// Retrieving data from the database

			System.out.println("Retrieving All the student Object :");
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			displayStudents(theStudents);

			System.out.println("Retrieving student based on firstName :");
			theStudents = session.createQuery("from Student s where s.firstName='Ashish'")
					.getResultList();
			displayStudents(theStudents);

			System.out.println("Retrieving student based on lastName or firstName :");
			theStudents = (List<Student>) session
					.createQuery("from Student s where s.lastName='Mamgain' OR s.firstName='Atul'").getResultList();
			displayStudents(theStudents);

			System.out.println("Retrieving student based on email  using like  :");
			theStudents = (List<Student>) session
					.createQuery("from Student s where s.email like '%erma@gmail.com'").getResultList();
			displayStudents(theStudents);

			System.out.println("Retriew Done!!!\n");

			// ********************************************************************************************************//

			// Updating the existing records based on id
			System.out.println("Updating Student FirstName");

			int studentId = 2;
			Student myStudent = session.get(Student.class, studentId);
			myStudent.setFirstName("Atul");

			theStudents = session.createQuery("from Student").getResultList();
			displayStudents(theStudents);
			
			
			//Updating email for all the students
			
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
