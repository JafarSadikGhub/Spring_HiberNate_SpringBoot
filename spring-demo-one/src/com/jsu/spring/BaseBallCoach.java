package com.jsu.spring;

public class BaseBallCoach implements Coach 
{
    @Override
    public String getDailyWorkout()
    {
    	return "Spend 30 mins on batting practice";
    }
}
