package com.ecommerse.test.service.impl;

import org.springframework.stereotype.Service;

import com.ecommerse.test.model.Employee;
import com.ecommerse.test.repository.EmployeeRepository;
import com.ecommerse.test.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	// field
	private EmployeeRepository employeeRepository;
	
	// constructor
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}

}
