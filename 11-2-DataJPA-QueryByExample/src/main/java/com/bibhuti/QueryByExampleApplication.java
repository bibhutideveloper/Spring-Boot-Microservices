package com.bibhuti;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.bibhuti.entity.Employee;
import com.bibhuti.repository.EmployeeRepository;

@SpringBootApplication
public class QueryByExampleApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(QueryByExampleApplication.class, args);
	
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		
		/*
		 * searching
		 */
		
		Employee emp = new Employee();
		emp.setGender("male");
		
		Example<Employee> of = Example.of(emp);
		
		List<Employee> emps = repository.findAll(of);
		
		emps.forEach(System.out::println);
		
		repository.getEmps();
		
		System.out.println("============================");
		List<Employee> emps2 = repository.getEmps();
		
		emps2.forEach(System.out::println);
		
	}

}
