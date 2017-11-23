package com.example.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//Create no arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-argument constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method: set fortune service");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes !";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
