package com.bibhuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class GreetController {
	@GetMapping("/hello")
	public String msg(Model model) {
		model.addAttribute("msg", "Welcome greet controller");
		return "index";
	}
}
