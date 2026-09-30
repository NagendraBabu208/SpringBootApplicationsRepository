package com.basics.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${employee.name}")
	private String name;
	@Value("${employee.empId}")
	private Integer empId;
	@Value("${employee.salary}")
	private double salary;
	
	private Address address;
	
	public Employee(String name, Integer empId, double salary, Address address) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return empId;
	}
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + ", address=" + address + "]";
	}
	
}
