package com.bibhuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
		
	@GetMapping("/hello")
	public String hello(Model model) {
		String msgText = "Good evening";
		
		model.addAttribute("msg", msgText);
		return "index";
	}
	
	@GetMapping("/greet")
	public String greet(Model model) {
		String msgText = "Good evening";
		
		String s = null;
		s.length();
		
		model.addAttribute("msg", msgText);
		return "index";
	}
	
}
