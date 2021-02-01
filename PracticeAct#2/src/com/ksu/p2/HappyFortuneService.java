package com.ksu.p2;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	String[] randArray = { "Today is your lucky day!", "You can Do it!", "Just Go ahead! Good Luck!" };
	Random rand = new Random();
	int randIndex = rand.nextInt(3);

	@Override
	public String getFortune() {
		return randArray[randIndex];
	}
}
