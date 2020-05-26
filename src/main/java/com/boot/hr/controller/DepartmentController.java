package com.boot.hr.controller;

 

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.hr.model.Department;
import com.boot.hr.model.Employee;
import com.boot.hr.service.DepartmentService;

@RestController
@RequestMapping(value = "/api/department")
public class DepartmentController {
	@Autowired
	private DepartmentService deptService ;
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String addDepartment(@RequestBody Department department) {
		System.out.println(department.toString());
		return null;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/v1")
	public ArrayList<Department> getAllDepartment() {
		
		return deptService.getDeptList();

	}
	
	


}
