package com.spring.javabase;

import java.util.Arrays;
import java.util.List;

public class Thriller implements IMovie {

	@Override
	public List<String> moviesAvailable() {
		
		return Arrays.asList("ThrillerMovie1","ThrillerMovie2","ThrillerMovie3");
	}

}
