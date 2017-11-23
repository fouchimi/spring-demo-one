package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.hashCode() + "\n");
		System.out.println(alphaCoach.hashCode() + "\n");
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location of theCoach: " + theCoach);
		
		System.out.println("\nMemory location of alphaCoach: " + alphaCoach);
		
		//Close Container
		context.close();
	}

}
