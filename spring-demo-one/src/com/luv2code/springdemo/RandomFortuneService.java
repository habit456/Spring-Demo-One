package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {
			"Be persistent.", 
			"Love yourself first.",
			"Exercise will keep you coding.",
			"Learn coding like a sport - practice, practice, practice"};
	
	private Random rand = new Random();
	
	public RandomFortuneService() {
		
	}
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(fortunes.length);
		return fortunes[index];
	}
}
