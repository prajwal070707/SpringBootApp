package com.boot.hr.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.boot.hr.model.Department;
import com.boot.hr.model.Employee;

@Service
public class DepartmentService {
	
	public String addDepartment(Department dept) {
		//TODO: Send dept to DB
		return "Department Added";
	}
	
	public ArrayList<Department> getDeptList() {
		//TODO: REmove the hardcoded data, and get list of all depts from DB
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
