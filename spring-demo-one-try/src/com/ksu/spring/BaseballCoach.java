package com.ksu.spring;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do batting for 60 mins";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
		// return "Today is your lucky day, ballers!";
	}

}
