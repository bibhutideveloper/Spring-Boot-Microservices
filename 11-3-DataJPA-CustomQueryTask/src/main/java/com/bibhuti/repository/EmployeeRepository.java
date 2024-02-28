package com.bibhuti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bibhuti.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value="update employee_tbl set emp_salary = ?1 where emp_id = ?2", nativeQuery=true)
	public void updateEmp();
	
	@Query(value="delete from employee_tbl where emp_id = ?1", nativeQuery=true)
	public void deleteEmp();
	
	@Query(value="insert into employee_tbl values(:id, :name, :salary, :gender)", nativeQuery=true)
	public void insertEmp();
	
}
