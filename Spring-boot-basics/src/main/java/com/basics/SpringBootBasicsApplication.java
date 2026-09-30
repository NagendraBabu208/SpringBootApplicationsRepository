package com.basics;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.basics.constructor.Student;
import com.basics.setter.Employee;

@SpringBootApplication
public class SpringBootBasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}
	
	@Autowired
	ApplicationContext applicationContext;
	
	
	private Employee employee;

    @Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

     private Student student;


	@Override
	public void run(String... args) throws Exception {
		
		Employee employee=applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
		
		System.out.println(employee);
		System.out.println("============================================");
		Student student=applicationContext.getBean("student", Student.class);
		System.out.println(student);
		
		String[] names=applicationContext.getBeanDefinitionNames();
		
		//śArrays.stream(names).forEach(System.out::println);
	}

}
