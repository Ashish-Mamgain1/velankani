package com.learn.springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5 km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it "+fortuneService.getFortune();
	}
	
	public void doMyStartUpWork() {
		System.out.println("Initializing using TrackCoach : doMyStartUpWork");
		
	}
	
	public void doMyShutDownWork() {
		System.out.println("Initializing using TrackCoach : doMyShutDownWork");
		
	}

}
