package com.spring.javabase;

import java.util.Arrays;
import java.util.List;

public class Comedy implements IMovie {

	@Override
	public List<String> moviesAvailable() {
		
		return Arrays.asList("ComedyMovie1","ComedyMovie2","ComedyMovie3");
	}

}
