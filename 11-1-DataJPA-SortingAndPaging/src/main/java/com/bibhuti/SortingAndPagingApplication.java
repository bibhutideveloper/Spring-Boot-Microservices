package com.bibhuti;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.bibhuti.entity.Employee;
import com.bibhuti.repository.EmployeeRepository;

@SpringBootApplication
public class SortingAndPagingApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context= SpringApplication.run(SortingAndPagingApplication.class, args);
	
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		
		/*
		 * save
		 */
		
//		Employee e1 = new Employee(2, "amar", 2000.00);	
//		repository.save(e1);
		
		/*
		 * saveAll
		 */
		
//		Employee e3 = new Employee(6, "harish", 2000.00);
//		Employee e4 = new Employee(7, "abhi", 4000.00);
//		Employee e5 = new Employee(8, "ajay", 6000.00);
//		repository.saveAll(Arrays.asList(e3, e4, e5));
		
		/*
		 * find all
		 */
		
//		List<Employee> emps = repository.findAll();
		
		/*
		 * sorting
		 */
		
//		Sort sort = Sort.by("empName"); // ascending
//		Sort sort = Sort.by("empSalary", "empName").descending(); // descending
//		List<Employee> emps = repository.findAll(sort);
		
		/*
		 * pagination
		 */
		
		int pageNo = 2;
		PageRequest page = PageRequest.of(pageNo-1, 3);
		
		Page<Employee> findAll = repository.findAll(page);
		List<Employee> emps = findAll.getContent();

		/*
		 * data printing
		 */
		
		emps.forEach(System.out::println);
	
	}

}
