package com.bibhuti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bibhuti.entity.Employee;
import com.bibhuti.repository.EmployeeRepository;

@SpringBootApplication
public class CustomQueryTaskApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(CustomQueryTaskApplication.class, args);
	
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
	
		System.out.println(repository.getClass().getName());
	
		Employee emp = new Employee();
	
		
		
	}

}
