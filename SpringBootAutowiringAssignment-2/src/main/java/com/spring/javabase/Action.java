package com.spring.javabase;

import java.util.Arrays;
import java.util.List;

public class Action implements IMovie {

	@Override
	public List<String> moviesAvailable() {
		
		return Arrays.asList("ActionMovie1","ActionMovie2","ActionMovie3");
	}

}
