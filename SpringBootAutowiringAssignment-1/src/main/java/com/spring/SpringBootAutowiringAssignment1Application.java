package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.auto.Restaurant;

@SpringBootApplication
public class SpringBootAutowiringAssignment1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowiringAssignment1Application.class, args);
	}
	
	
	private Restaurant restaurant;


	@Autowired
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	@Override
	public void run(String... args) throws Exception {
		restaurant.showItems("In").forEach(System.out::println);
		System.out.println("=======================================================");
		restaurant.showItems("Ch").forEach(System.out::println);
		System.out.println("=========================================================");
		restaurant.showItems("It").forEach(System.out::println);

		
	}
	

}
