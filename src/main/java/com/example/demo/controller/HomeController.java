package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class HomeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/test")
	public String test() {
		return "Hello Linux";
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable long id) {
		return employeeService.findById(id);
	}
	
	@PostMapping("/employee/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@DeleteMapping("/employee/delete/{id}")
	public void deleteEmployee(@PathVariable long id){
		employeeService.deleteById(id);
	}
}
