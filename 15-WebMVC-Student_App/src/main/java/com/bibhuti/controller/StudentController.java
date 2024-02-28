package com.bibhuti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bibhuti.entity.Student;
import com.bibhuti.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		formInitBinding(model);
		return "index";
	}

	@PostMapping("/save")
	public String loadIndexPage(Student s, Model model) {
//		System.out.println(s);
		formInitBinding(model);
		boolean isSaved = service.saveStudent(s);
		if(isSaved) {
			model.addAttribute("msg", "Data saved...");
		}
		
		return "index";
	}
	
	private void formInitBinding(Model model) {
		Student sobj =  new Student();
		model.addAttribute("student", sobj);		
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTimings());
	}
}
