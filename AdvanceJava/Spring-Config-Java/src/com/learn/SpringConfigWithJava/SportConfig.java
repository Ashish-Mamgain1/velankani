package com.learn.SpringConfigWithJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.learn.SpringConfigWithJava")
@PropertySource("classpath:mylogger.properties")
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
