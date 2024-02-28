package com.bibhuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String user(Model model) {
		String msgText = "Hello user";
		
		int i = 10/0;
		
		model.addAttribute("msg", msgText);
		return "index";
	}
}
