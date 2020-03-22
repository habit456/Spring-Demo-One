package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmailAddress());
		
		// close the context
		context.close();

	}

}
