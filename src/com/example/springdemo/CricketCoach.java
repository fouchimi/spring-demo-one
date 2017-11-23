package com.example.springdemo;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	//Create no argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-argument constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method: set fortune service");
		this.fortuneService = fortuneService;
	}
	
    public void setEmailAddress(String emailAddress) {
    	System.out.println("Inside setter method for setEmailAddress");
		this.emailAddress = emailAddress;
	}
    
    public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setTeam(String team) {
		System.out.println("Inside setter method for setTeam");
		this.team = team;
	}
	
	public String getTeam() {
		return team;
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
