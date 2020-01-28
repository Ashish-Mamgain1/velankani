package com.learn.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("footBallCoach",Coach.class);
		
		System.out.println("The Daily WorkOut is : "+ theCoach.getDailyWorkOut());
		System.out.println("The Daily Fortune is : "+ theCoach.getDailyFortune());
		context.close();

	}

}
