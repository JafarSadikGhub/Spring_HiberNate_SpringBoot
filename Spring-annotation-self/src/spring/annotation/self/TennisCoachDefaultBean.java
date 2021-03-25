package spring.annotation.self;

import org.springframework.stereotype.Component;

@Component
public class TennisCoachDefaultBean implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Default bean: Practice Backhand Volley";
	}

}
