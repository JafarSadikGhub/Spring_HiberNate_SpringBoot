package spring.annotation.self;

//@Component
public class TennisCoachAutowiredFieldInjection implements CoachAutowiredConstructor {

	public TennisCoachAutowiredFieldInjection() {
		System.out.println(">> Inside Field Injection Constructor");
	}

	// @Autowired
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
