package com.jsu.spring;

public class MyApp 
{   
	public static void main(String[] args) {
		Coach theCoach = new BaseBallCoach();
		System.out.println(theCoach.getDailyWorkout());
	}
}
