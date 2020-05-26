package com.boot.hr.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.hr.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}