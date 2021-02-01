package com.ksu.p2;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}