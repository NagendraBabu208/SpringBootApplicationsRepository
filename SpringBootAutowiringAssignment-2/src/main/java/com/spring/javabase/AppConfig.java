package com.spring.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	@Primary
	public IMovie comedy() {
		return new Comedy();
		
	}
	
	@Bean
	public IMovie getActionObj() {
		return new Action();
		
	}
	
	@Bean
	public IMovie thriller() {
		return new Thriller();
		
	}
	@Bean
	Theater  theater() {
		return new Theater();
	}

}
