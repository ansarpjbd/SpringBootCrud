package com.gd.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gd.demo.demo.entity.Employee;
import com.gd.demo.demo.repository.EmployeeRepo;
import com.gd.demo.demo.services.EmployeeService;
import com.gd.demo.demo.servicesImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empServices; 
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	//EmployeeService emp1=new EmployeeServiceImpl();
	
	
	@GetMapping("/hello")
	public String hello()
	{
		Employee emp=new Employee(null, "kawinder",10000);
		empServices.add(emp);
	
		
		return "Enployee controller";
	}
	
	

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee()
	{
		
		return employeeRepo.findAll();
	}
	
	
	@PostMapping("/add")
	public List<Employee> addEmployeeData(@RequestBody Employee emp)
	{
		employeeRepo.save(emp);
		return employeeRepo.findAll();
	}
	
	
	@PutMapping("/update")
	public List<Employee> updateEmployeeData(@RequestBody Employee emp)
	{
		employeeRepo.save(emp);
		return employeeRepo.findAll();
	}

	
	@DeleteMapping("/delete/{id}")
	public List<Employee> deleteEmployeeData(@PathVariable("id") Long id)
	{
		employeeRepo.deleteById(id);
		return employeeRepo.findAll();
	}



}
