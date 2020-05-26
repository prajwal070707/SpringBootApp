package com.boot.hr.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.hr.model.Employee;
import com.boot.hr.service.EmployeeService;

@RestController
@RequestMapping( value = "/api/employee")

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		
		return employeeService.addEmployee(employee);
	}


	@RequestMapping(method = RequestMethod.GET, value = "/v1")
	public ArrayList<Employee> getAllEmployee() {

		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/{{id}}")
	public Employee getEmployeeById(@PathVariable Integer employeeId){
		return employeeService.getEmployeeById(employeeId);
	}
}
