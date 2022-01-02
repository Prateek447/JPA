package com.restful.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Component;

import com.restful.models.Employee;

@Component
public class EmployeeDao {

	private static List<Employee> employees = new ArrayList<>();
	
	static {
		employees.add(new Employee(3, "Ram", 34));
		employees.add(new Employee(5,"Mukul",30));
		employees.add(new Employee(6,"Ravi",29));
	}
	
	
	public List<Employee> getAllEmployee(){
		return employees;
	}
	
	
	public Employee saveEmployee(Employee e) {
		employees.add(e);
		return e;
	}
	
	public void deleteById(int id) {
		ListIterator<Employee> iterator = employees.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next().getId()==id) {
				iterator.remove();
				return;
			}
			
		}
	}
}
