package com.jsu.spring;

/**
 * @author JrBcrypted
 *
 */
public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		// super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard at 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
}
