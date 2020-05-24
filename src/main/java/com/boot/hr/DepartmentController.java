package com.boot.hr;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.hr.model.Department;
import com.boot.hr.model.Employee;

@RestController
@RequestMapping(value = "/api/department")
public class DepartmentController {
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String addDepartment(@RequestBody Department department) {
		System.out.println(department.toString());
		return null;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/v1")
	public ArrayList<Department> getAllDepartment() {

		Department dept = new Department();
		Employee emp = new Employee();
		emp.setFirstName("Ram");
		emp.setLastName("Acharya");
		emp.setAge(23);
		emp.setEmployeeId(106);

		dept.setDepartmentName("HR");
		dept.setDepartmentHead(emp);
		dept.setDepartmentID(105);
		
		Department dept2 = new Department();
		Employee emp2 = new Employee();
		emp2.setFirstName("hari");
		emp2.setLastName("Acharya");
		emp2.setAge(23);
		emp2.setEmployeeId(106);

		dept2.setDepartmentName("R&D");
		dept2.setDepartmentHead(emp2);
		dept2.setDepartmentID(105);

		ArrayList<Department> deptList = new ArrayList<Department>();
		deptList.add(dept);
		deptList.add(dept2);
		return deptList;

	}

}
