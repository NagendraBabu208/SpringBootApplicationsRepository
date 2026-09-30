package com.spring.traing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.spring.traing");
		Employee employee=applicationContext.getBean("employee", Employee.class);
	
		
		System.out.println(employee);
	
	}

}
