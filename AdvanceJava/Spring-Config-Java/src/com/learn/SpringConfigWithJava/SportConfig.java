package com.learn.SpringConfigWithJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.learn.SpringConfigWithJava")
@PropertySource("classpath:mylogger.properties")
public class SportConfig {
	
	
	//If you are using Spring 4.2 and lower, you will need to add the following commented code.
	// add support to resolve ${...} properties
    /*@Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }*/
	
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
