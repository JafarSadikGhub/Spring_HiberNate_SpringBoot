package com.ksu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	public static void main(String[] args) {
		// FortuneService f1 = new FortuneService();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean isEqual = (theCoach == alphaCoach);
		System.out.println("Are equal? " + isEqual);
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
