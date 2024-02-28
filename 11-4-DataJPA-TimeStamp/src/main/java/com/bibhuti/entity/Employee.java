package com.bibhuti.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_salary")
	private Double empSalary;
	
	@CreationTimestamp
	@Column(name="date_created", updatable=false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name="last_updated", insertable=false)
	private LocalDate lastUpdated;
}
