package com.basics.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private Integer studId;
	
	private Department department;
	
	
	public Student(Department department) {
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	@Value("nagendra")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudId() {
		return studId;
	}
	@Value("1259975")
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studId=" + studId + ", department=" + department + "]";
	}
	
	

}
