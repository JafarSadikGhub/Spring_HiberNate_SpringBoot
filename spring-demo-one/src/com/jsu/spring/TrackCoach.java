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

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside init method");
	}

	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside destroy method");
	}
}
