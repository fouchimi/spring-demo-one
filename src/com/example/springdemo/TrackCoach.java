package com.example.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("TrackCoach: inside default constructor");
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		System.out.println("TrackCoach: inside constructor with argument");
	}
	
	//Add initialization method
	public void doStartUpStuff() {
		System.out.println("TrackCoach: inside method doStartUpStuff");
	}
	
	//Clean up method
	public void doCleanUpStuff() {
		System.out.println("TrackCoach: inside method doCleanUpStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}

}
