package com.bibhuti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bibhuti.entity.Employee;
import com.bibhuti.repository.EmployeeRepository;

@SpringBootApplication
public class TimeStampApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(TimeStampApplication.class, args);
	
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
	
		Employee emp = new Employee();
		
		emp.setEmpId(2);
		emp.setEmpName("amar");
		emp.setEmpSalary(4030.00);
		
		repository.save(emp);
	
	}

}
