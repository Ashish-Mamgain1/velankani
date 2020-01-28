package com.learn.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;

	public String getEmailAddress() {
		System.out.println("Inside CricketCoach : getEmailAddress");
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside CricketCoach : setEmailAddress");
		this.emailAddress = emailAddress;
	}

	private String team;

	public String getTeam() {
		System.out.println("Inside CricketCoach : getTeam");
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside CricketCoach : setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Inside CricketCoach : no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside CricketCoach : setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
