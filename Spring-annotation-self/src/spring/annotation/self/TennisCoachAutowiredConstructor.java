package spring.annotation.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachAutowiredConstructor implements CoachAutowiredConstructor {

	private FortuneService fortuneService;

	@Autowired
	public TennisCoachAutowiredConstructor(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Autowired: Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
