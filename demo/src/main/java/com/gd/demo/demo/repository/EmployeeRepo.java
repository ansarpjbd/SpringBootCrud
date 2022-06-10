package com.gd.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.gd.demo.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
