package com.learn.SpringConfigWithJava;

public class SwimCoach implements Coach {

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
