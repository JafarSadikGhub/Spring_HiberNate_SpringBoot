package com.myself.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CombineSetter theSetter = context.getBean("combineSetter", CombineSetter.class);
		System.out.println(theSetter.goodAfternoon());
		System.out.println(theSetter.getCodeInstruction());
		System.out.println(theSetter.getEmailAddress());
		System.out.println(theSetter.getContact());
		System.out.println(theSetter.getEmailAddress2());
		System.out.println(theSetter.getContact2());
		context.close();
	}

}
