package com.learn.annotation;

import org.springframework.stereotype.Component;

@Component("loloo")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practise your Backhand Service";
	}

}
