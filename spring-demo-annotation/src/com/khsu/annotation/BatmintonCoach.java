package com.khsu.annotation;

import org.graalvm.compiler.lir.CompositeValue.Component;
import org.springframework.beans.factory.annotation.Autowired;

/*Use default component names. If we make it default
then the component id will be "batmmintonCoach"*/
//@Component("thatSillyCoach")
@Component
public class BatmintonCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;

//	@Autowired
//	BatmintonCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	BatmintonCoach() {
		System.out.println(">>>Inside Default Constructor: BadmintonCoach");
	}

//	@Autowired
//	public void setDailyFortuneService(FortuneService fortuneService) {
//		System.out.println(">>>Inside setter method: BadmintonCoach");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Warm up daily for 1hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.dailyFortune();
	}
}
