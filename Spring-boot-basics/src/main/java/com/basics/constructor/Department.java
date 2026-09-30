package com.basics.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private String deptName;
	private String deptHead;
	
	public Department() {
	}

	public Department(String deptName, String deptHead) {
		super();
		this.deptName = deptName;
		this.deptHead = deptHead;
	}

	public String getDeptName() {
		return deptName;
	}

	
	@Value("ECE")
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHead() {
		return deptHead;
	}

	@Value("ECEHead")
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptHead=" + deptHead + "]";
	}
	
	

}
