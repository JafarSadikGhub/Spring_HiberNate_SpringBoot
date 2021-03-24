package com.myself.spring;

public class GoodMorningGreeting implements Greetings {
	@Override
	public String getDailyGreetings() {
		return "Good Morning! You're a star!";
	}
}
