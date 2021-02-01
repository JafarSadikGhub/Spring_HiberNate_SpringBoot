package com.jsu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beansScope-applicationContext.xml");
		// retrieve bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
		boolean value = (theCoach == alphaCoach);
		String str = String.valueOf(value);
		System.out.println("Are theCoach and alphaCoach equal?" + str);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
	}

}
