package com.jsu.spring;

public class BaseBallCoach implements Coach 
{
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseBallCoach()
	{
		
	}
	
	// Define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService)
	{
		super();
		fortuneService = theFortuneService;
	}
    @Override
    public String getDailyWorkout()
    {
    	return "Spend 30 mins on batting practice";
    }

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
