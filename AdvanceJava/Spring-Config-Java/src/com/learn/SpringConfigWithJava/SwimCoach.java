package com.learn.SpringConfigWithJava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class SwimCoach implements Coach {

	@Value("${foo.name}")
	private String name;

	@Value("${foo.email}")
	private String email;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meter as a warmup.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
