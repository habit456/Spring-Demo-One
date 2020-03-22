package com.luv2code.springdemo;

public class TennisCoach implements Coach {
	FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Inside TennisCoach.TennisCoach()");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hit some balls around";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
}
