package com.spring.traing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	private Integer empId;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Integer empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	@Value("Nagendra")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	@Value("1259975")
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	@Value("56000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
	

}
