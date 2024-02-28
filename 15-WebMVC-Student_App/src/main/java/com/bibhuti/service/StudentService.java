package com.bibhuti.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibhuti.entity.Student;
import com.bibhuti.entity.StudentEntity;
import com.bibhuti.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;

	public boolean saveStudent(Student student) {

		System.out.println(student);

		StudentEntity entity = new StudentEntity();

		BeanUtils.copyProperties(student, entity);
		entity.setTimings(Arrays.toString(student.getTimings()));

		System.out.println(entity);
		
		repo.save(entity);

		return true;

	}

	public List<String> getCourses() {
		return Arrays.asList("Java", "Python", "DevOps", "C++");
	}

	public List<String> getTimings() {
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}

}