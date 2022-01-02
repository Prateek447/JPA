package com.restful.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.dao.EmployeeDao;
import com.restful.models.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/employees")
	public List<Employee>getAllEmployee(){
		return dao.getAllEmployee();
		
	}
	
	
	@PostMapping("/createEmployee")
	public Employee addEmployee(@RequestBody Employee e){
		return dao.saveEmployee(e);
		
	}
	
	@DeleteMapping("/employee/{id}")
	public void deletEmployee(@PathVariable int id) {
		dao.deleteById(id);
	}
	
	
}
