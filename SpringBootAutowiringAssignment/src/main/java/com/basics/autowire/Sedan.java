package com.basics.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Sedan implements ICar{

	
	
	@Override
	public List<String> showBrands() {
		
		return Arrays.asList("Skoda","Toyota","Volkswagen","Rolls-Royce");
	}

}
