package com.learn.SpringConfigWithJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimBeanJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyFortune());

		System.out.println( theCoach.getDailyWorkout());
		
		System.out.println("Email : " + theCoach.getEmail());
		System.out.println("Name  : " + theCoach.getName());
		

		context.close();

	}

}
