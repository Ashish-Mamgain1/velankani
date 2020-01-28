package com.learn.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach theAlphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == theAlphaCoach);
		System.out.println("\nPointing to the same location : " + result);
		System.out.println("\nMemory location for theCoach : " + theCoach);
		System.out.println("\nMemory location for theAlphaCoach : " + theAlphaCoach+"\n");
		
		context.close();

	}

}
