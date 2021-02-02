package com.khsu.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String dailyFortune() {

		return "You can do it! Good Luck!!";
	}

}
