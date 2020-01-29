package com.learn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	// Field Injection : No need for setter and getter method.Put directly
	// @Autowired on top of the field
	@Autowired
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">>TennisCoach : Inside default constructor");
		// TODO Auto-generated constructor stub
	}

	/*
	 * //Constructor Injection
	 * 
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	/*// Setter Injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach : Inside setFortuneService");
		fortuneService = theFortuneService;
	}

	// Method Injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("Hello Ashish calling Ashish : " + theFortuneService);
	}
*/
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practise your Backhand Service";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
