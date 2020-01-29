package com.learn.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
			
		// call our new swim coach methods ... has the props values injected
		/*System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());*/
		
		// close the context
		context.close();
	}

}







