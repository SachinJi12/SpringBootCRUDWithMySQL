package com.fullstackDevelop.springbootproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackDevelop.springbootproject.entity.Employee;
import com.fullstackDevelop.springbootproject.repos.EmployeeCrudRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeCrudRepo repos;

	// these are all post(add) methods
	// save the Employee
	public Employee saveEmployee(Employee emp) {
		return repos.save(emp);
	}
	
	// List the Employee
	public List<Employee> lstEmployee(List<Employee> emplst) {
			return repos.saveAll(emplst);
	}
	
	//these are get(retrieve) methods
	public List<Employee> getEmployee(){
		return repos.findAll();
	}
	
	//to get the emp by id and it returns optional
	public Optional<Employee> getEmployeebyId(Long id){
			return Optional.ofNullable(repos.findById(id).orElse(null));
	}
	
	//delete the emp by id
	public String deleteEmployeebyId(int id){
		repos.deleteById((long) id);
		return "Id is deleted"+ id;
	}

}
