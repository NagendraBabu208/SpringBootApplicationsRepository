package com.basics.autowire;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {
	
	
	
	@Autowired
	@Qualifier("sedan")// autowiring by type
	private  ICar car;
	
	@Autowired
	private ICar convertible;  //autowiring by name
	
	
	private ICar hatchBack;
	
	
	
	public CarFactory(ICar hatchBack) {  // autowiring by Constructor
		this.hatchBack=hatchBack;
		
	}


	
	
	
	public List<String> showCarBrands(String brandsType) {
		
		if(CarBrands.SEDAN.name().equals(brandsType.toUpperCase())) {
			return car.showBrands();
		}
		if(CarBrands.CONVERTIBLE.name().equals(brandsType.toUpperCase())) {
			return convertible.showBrands();
		}
		if(CarBrands.HATCHBACK.name().equals(brandsType.toUpperCase())) {
		return hatchBack.showBrands();
		}
		
		return null;
		
		
		
	}

}
