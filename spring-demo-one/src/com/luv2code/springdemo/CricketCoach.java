package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	// add new fields
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do Cricket stuff";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach: " + fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside CricketCoach.setFortuneService()");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside CricketCoach.setEmailAddress()");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside CricketCoach.setTeam()");
		this.team = team;
	}
}
