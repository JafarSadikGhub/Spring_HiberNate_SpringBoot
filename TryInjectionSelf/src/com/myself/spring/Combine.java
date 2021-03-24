package com.myself.spring;

public class Combine implements CombineInterface {
	private GoodMorningGreeting goodMorningGreeting;
	private InstructLearnSpring instructLearnSpring;

	public Combine(GoodMorningGreeting goodMorningGreeting, InstructLearnSpring instructLearnSpring) {
		this.goodMorningGreeting = goodMorningGreeting;
		this.instructLearnSpring = instructLearnSpring;
	}

	@Override
	public String goodMorning() {
		return goodMorningGreeting.getDailyGreetings();
	}

	@Override
	public String instruction() {
		return instructLearnSpring.getInstruction();
	}

}
