package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach betaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == betaCoach);
		System.out.println(result);
		System.out.println("theCoach memory location: " + theCoach);
		System.out.println("betaCoach memory location: " + betaCoach);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// new methods
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
