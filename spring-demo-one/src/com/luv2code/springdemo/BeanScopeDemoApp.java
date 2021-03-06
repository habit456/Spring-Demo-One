package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (myCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for myCoach: " + myCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		context.close();
	}

}
