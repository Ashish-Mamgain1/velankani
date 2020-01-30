package com.learn.SpringConfigWithJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.learn.SpringConfigWithJava")
public class SportConfig {
	// define bean for sadFortuneService

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for SwimCoach service and inject dependencies

	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
	}

}
