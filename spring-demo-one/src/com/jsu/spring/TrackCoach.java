package com.jsu.spring;

public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
    	return "Run hard 5K";
    }

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
