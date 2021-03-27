package spring.annotation.self;

//@Component
public class TennisCoachAutowiredConstructor implements CoachAutowiredConstructor {

	private FortuneService fortuneService;

	// @Autowired
	public TennisCoachAutowiredConstructor(FortuneService fortuneService) {
		System.out.println("Inside Test");
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
