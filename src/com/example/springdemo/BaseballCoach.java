package com.example.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	//Define constructor for fortune service
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on batting practice !";
	}

	@Override
	public String getDailyFortune() {
	
		//use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

	
}
