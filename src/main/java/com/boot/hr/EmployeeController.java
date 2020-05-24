package com.boot.hr;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.hr.model.Employee;

@RestController
@RequestMapping( value = "/api/employee")

public class EmployeeController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return null;
	}


	@RequestMapping(method = RequestMethod.GET, value = "/v1")
	public ArrayList<Employee> getAllEmployee() {
		
		
		Employee emp = new Employee();
		emp.setFirstName("Krishna");
		emp.setLastName("Shree");
		emp.setAge(999999999);
		emp.setEmployeeId(1);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("Lakshman");
		emp2.setLastName("Ram");
		emp2.setAge(999999999);
		emp2.setEmployeeId(1);
		
		
		
		//just for testing
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		
		arr.add(emp);
		arr.add(emp2);
		
		
		return arr;
	}
	
	
	public ArrayList<Employee> getEmployeeById(Integer employeeId){
		return null;
	}
}
