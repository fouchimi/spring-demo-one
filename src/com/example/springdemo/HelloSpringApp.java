package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
