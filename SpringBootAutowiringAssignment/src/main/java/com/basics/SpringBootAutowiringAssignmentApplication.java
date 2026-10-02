package com.basics;

import com.basics.autowire.CarFactory;
import com.basics.autowire.ICar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAutowiringAssignmentApplication  implements CommandLineRunner{

	
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowiringAssignmentApplication.class, args);
	}
	
	private  CarFactory carFactory;

	@Autowired 
	public void setCarFactory(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		carFactory.showCarBrands("sedan").forEach(System.out::println);
		System.out.println("==========================================================");
		carFactory.showCarBrands("convertible").forEach(System.out::println);
		System.out.println("============================================================");
		carFactory.showCarBrands("hatchBack").forEach(System.out::println);
		
		
		
		
	}

}
