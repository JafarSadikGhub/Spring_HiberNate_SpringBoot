package com.jsu.spring;

public class CricketCoach implements Coach 
{

	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("CrciketCoach: inside no arg constructor.");
	}
	
	
	public FortuneService getFortuneService() { 
		return fortuneService;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CrciketCoach: inside setFortuneService Setter.");
		this.fortuneService = fortuneService;
		
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
