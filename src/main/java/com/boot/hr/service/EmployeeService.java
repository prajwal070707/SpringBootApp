package com.boot.hr.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.hr.model.Employee;
import com.boot.hr.repository.EmployeeRepository;

@Service
public class EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String addEmployee(Employee employee) {
		//TODO: Call DB to add Employeess
		return "Employee Added";
	}
	
	public ArrayList<Employee> getAllEmployee() {
		//TODO: Remove the hardcoded data and get list of all employees from DB
		ArrayList<Employee> response=new ArrayList<>();
		
		Iterator<Employee> iter = employeeRepository.findAll().iterator();
		while(iter.hasNext()) {
			response.add(iter.next());
		}
		
		return response;
	}
	
	public Employee getEmployeeById(Integer employeeId){
		//TODO: call db to get employee details whose ID is employeeId
		Employee emp = new Employee();
		emp.setFirstName("Krishna");
		emp.setLastName("Shree");
		emp.setAge(999999999);
		emp.setEmployeeId(employeeId);

		return emp;
	}
	
	

}
