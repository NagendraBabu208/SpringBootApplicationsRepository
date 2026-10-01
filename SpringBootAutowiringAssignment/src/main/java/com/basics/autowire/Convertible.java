package com.basics.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Convertible implements ICar{

	
	@Override
	public List<String> showBrands() {
		
		return Arrays.asList("BMW","Mercedes-Benz","Lamborghini","McLaren","Ferrari");
	}

}
