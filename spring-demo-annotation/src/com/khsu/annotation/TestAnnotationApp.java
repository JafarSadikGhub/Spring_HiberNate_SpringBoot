package com.khsu.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		// Calling by default component name...
		Coach theCoach = context.getBean("batmintonCoach", Coach.class);
		System.out.println("Do it: " + theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}
}
