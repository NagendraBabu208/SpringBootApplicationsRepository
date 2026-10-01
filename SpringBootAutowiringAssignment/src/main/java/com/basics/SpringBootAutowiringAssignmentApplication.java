package com.basics;

import com.basics.autowire.CarFactory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAutowiringAssignmentApplication  implements CommandLineRunner{

	private  CarFactory carFactory;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowiringAssignmentApplication.class, args);
	}
	
	@Autowired
	private ApplicationContext applicationContext;

	SpringBootAutowiringAssignmentApplication(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * CarFactory factory=applicationContext.getBean("carFactory",
		 * CarFactory.class);
		 * 
		 * List<String> brands=factory.showCarBrands("hatchback");
		 * brands.stream().forEach(System.out::println);
		 */
		carFactory.showCarBrands("sedan").forEach(System.out::println);
		System.out.println("==========================================================");
		carFactory.showCarBrands("convertible").forEach(System.out::println);
		System.out.println("============================================================");
		carFactory.showCarBrands("hatchback").forEach(System.out::println);
		
		
		
		
	}

}
