package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public interface EmployeeService extends JpaRepository<Employee, Long>{

}
