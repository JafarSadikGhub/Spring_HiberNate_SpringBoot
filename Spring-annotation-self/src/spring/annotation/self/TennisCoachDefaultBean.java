package spring.annotation.self;

//@Component
public class TennisCoachDefaultBean implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Default bean: Practice Backhand Volley";
	}

}
