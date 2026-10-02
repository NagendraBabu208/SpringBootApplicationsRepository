package com.spring.javabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Theater {
	
	@Autowired
	private IMovie movieRef;
	
	public List<String> availableMovies(String moviesType) {
		
	    return movieRef.moviesAvailable();
	    
		
		
		
	}
	
	
	

}
