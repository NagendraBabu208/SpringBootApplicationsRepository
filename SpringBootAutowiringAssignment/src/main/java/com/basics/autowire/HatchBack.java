package com.basics.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HatchBack implements ICar{
	
	

	@Override
	public List<String> showBrands() {
		
		return Arrays.asList("Maruti Suzuki Swift","Tata Tiago","Hyundai i20","Maruti Suzuki Baleno");
	}

}
