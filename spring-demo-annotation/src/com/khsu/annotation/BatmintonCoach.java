package com.khsu.annotation;

import org.springframework.stereotype.Component;

/*Use default component names. If we make it default
then the component id will be "batmmintonCoach"*/
//@Component("thatSillyCoach")
@Component
public class BatmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Warm up daily for 1hr";
	}
}
