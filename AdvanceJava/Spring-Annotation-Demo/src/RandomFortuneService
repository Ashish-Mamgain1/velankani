package com.learn.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[] = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the Reward." };

	private Random myRandom = new Random();

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
