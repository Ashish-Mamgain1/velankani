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

			System.out.println("Creating Student Object : ");
			Student student = new Student("Ashish", "Mamgain", "ashish.mamgain@gmail.com");

			System.out.println("Starting transaction : ");
			session.beginTransaction();

			System.out.println("Saving the student Object : ");
			session.save(student);
			session.getTransaction().commit();
			System.out.println("Done!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
