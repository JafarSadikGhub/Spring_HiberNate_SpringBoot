package spring.annotation.self;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class TennisCoachAutowiredSetter implements CoachAutowiredConstructor {

	private FortuneService fortuneService;

	TennisCoachAutowiredSetter() {
		System.out.println(">> TennisCoachAutowiredSetter: inside default constructor");
	}

	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">> TennisCoach: inside setFortuneService");
	 * this.fortuneService = fortuneService; }
	 */
	// Autowired can be used to any Method.
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
