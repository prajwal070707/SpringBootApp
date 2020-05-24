package com.boot.hr.model;

import java.util.ArrayList;

public class Department {

	private String departmentName;
	private Employee departmentHead;
	private Integer departmentID;
	private ArrayList<Employee> employeeList;

	public Department() {
		super();
	}

	public Department(String departmentName, Employee departmentHead, Integer departmentID,
			ArrayList<Employee> employeeList) {
		super();
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
		this.departmentID = departmentID;
		this.employeeList = employeeList;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getDepartmentHead() {
		return departmentHead;
	}

	public void setDepartmentHead(Employee departmentHead) {
		this.departmentHead = departmentHead;
	}

	public Integer getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentHead=" + departmentHead + ", departmentID="
				+ departmentID + ", employeeList=" + employeeList + "]";
	}
	
	

}
