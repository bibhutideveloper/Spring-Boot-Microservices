package com.bibhuti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bibhuti.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
}
