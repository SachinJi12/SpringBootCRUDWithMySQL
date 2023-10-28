package com.fullstackDevelop.springbootproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstackDevelop.springbootproject.entity.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long>{
	

}
