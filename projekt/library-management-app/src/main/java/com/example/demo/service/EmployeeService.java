package com.example.demo.service;

import java.util.List; 

import com.example.demo.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long Id);
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}
