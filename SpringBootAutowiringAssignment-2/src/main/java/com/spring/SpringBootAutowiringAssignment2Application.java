package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.javabase.Theater;

@SpringBootApplication
public class SpringBootAutowiringAssignment2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowiringAssignment2Application.class, args);
	}
	
	@Autowired
	private Theater theater;
	
	





	@Override
	public void run(String... args) throws Exception {
		
		theater.availableMovies("co").forEach(System.out::println);
		
		
	}

}
