package com.gd.demo.demo.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gd.demo.demo.entity.Employee;
import com.gd.demo.demo.repository.EmployeeRepo;
import com.gd.demo.demo.services.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	@Override
	public void add(Employee e) {
		
		employeeRepo.save(e);
		
	}
	
	
	

}
