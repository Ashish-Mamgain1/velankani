
package com.learn.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.hibernate.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {

			int studentId = 4;
			// Get a new session and start transaction
			Session session = factory.getCurrentSession();
			session.beginTransaction();

			// Retrieve student based on the primary key
			System.out.println("Getting student with id :" + studentId);
			Student myStudent = session.get(Student.class, studentId);

			// Delete the student
			System.out.println("Deleting Student : " + myStudent);
			session.delete(myStudent);
			
			// Delete the Student version 2
			System.out.println("Deleting Student having Id: 3");
			session.createQuery("delete from Student where id =3").executeUpdate();
			

			// Commit the transaction
			session.getTransaction().commit();

			System.out.println("Done!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
