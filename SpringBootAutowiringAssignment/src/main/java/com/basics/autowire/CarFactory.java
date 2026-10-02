package com.basics.autowire;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {
	
	
	
	@Autowired
	@Qualifier("sedan")// autowiring by type
	private  ICar iCar;
	
	@Autowired
	private ICar convertible;  //autowiring by name
	
	
	private ICar nCar;
	
	
	public CarFactory(@Qualifier("hatchBack") ICar nCar) { // autowiring by Constructor
		super();
		this.nCar=nCar;
		
	}


	
	
	
	public List<String> showCarBrands(String brandsType) {
		List<String> brands=new ArrayList<>();
		if(CarBrands.SEDAN.name().equals(brandsType.toUpperCase())) {
			 brands=iCar.showBrands();
		}
		else if(CarBrands.CONVERTIBLE.name().equals(brandsType.toUpperCase())) {
			brands= convertible.showBrands();
		}
		else if(CarBrands.HATCHBACK.name().equals(brandsType.toUpperCase())) {
	       	brands= nCar.showBrands();
		}
		
		else {
			brands=Arrays.asList("No car brands are available!!! ");
			
		}
		
		return brands;
	
		
		
	}

}
