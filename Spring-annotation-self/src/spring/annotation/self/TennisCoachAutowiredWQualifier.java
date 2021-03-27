package spring.annotation.self;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachAutowiredWQualifier implements CoachAutowiredConstructor {
	public TennisCoachAutowiredWQualifier() {
		System.out.println(">> Inside Field Injection Constructor with Qualifier");
	}

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice fronthand volley";
	}

	@Override
	public String getDailyFortune() {
		return "Do it" + fortuneService.getFortune();
	}
}
