package com.learn.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			
			System.out.println("Starting transaction : ");
			session.beginTransaction();

			System.out.println("Creating 3 Student Object : ");
			Student student = new Student("Ashish", "Mamgain", "ashish.mamgain@gmail.com");
			Student student1 = new Student("Atul", "Verma", "atul.verma@gmail.com");
			Student student2 = new Student("Ankit", "Sharma", "ankit.sharma@gmail.com");
			Student student3 = new Student("Arvind", "Shastri", "arvind.shastri@gmail.com");

			System.out.println("Saving the student Object : ");
			session.save(student);
			session.save(student1);
			session.save(student2);
			session.save(student3);			

			session.getTransaction().commit();
			System.out.println("Done!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
