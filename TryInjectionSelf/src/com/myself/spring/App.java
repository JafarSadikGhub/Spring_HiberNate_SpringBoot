package com.myself.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CombineInterface theCombineInterface = context.getBean("combine", CombineInterface.class);
		System.out.println(theCombineInterface.goodMorning());
		System.out.println(theCombineInterface.instruction());
		context.close();
	}

}
