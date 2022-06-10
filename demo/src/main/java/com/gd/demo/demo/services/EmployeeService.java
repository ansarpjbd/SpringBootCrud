package com.gd.demo.demo.services;

import org.springframework.stereotype.Service;

import com.gd.demo.demo.entity.Employee;

@Service
public interface EmployeeService {
	
	public void add(Employee e);

}
