package com.example.springdemo;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {"Today is your lucky day", 
			"You've earned points to move to the next step", 
			"Awesome coding, congrats !!"};
	
	@Override
	public String getFortune() {
		
		int randNumber = (int) (Math.random() * (fortunes.length)) % fortunes.length;
		System.out.println("Index : " + randNumber);
		
		return fortunes[randNumber];
	}

}
