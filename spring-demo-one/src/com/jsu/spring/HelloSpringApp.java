package com.jsu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp 
{
     public static void main(String[] args) 
     {
	     // Load the Spring config file
    	 ClassPathXmlApplicationContext  context = 
    			 new ClassPathXmlApplicationContext("applicationContext.xml");
    	 
    	 // Retrieve bean from spring container
    	 Coach theCoach = context.getBean("myCoach", Coach.class);
    	 
    	 // Call methods on the bean
    	 System.out.println(theCoach.getDailyWorkout());
    	 
    	 // let's call our new method for fortunes
    	 System.out.println(theCoach.getDailyFortune()); 
    	 
    	 // Close the context
         context.close(); 
    	 
	 }
}
