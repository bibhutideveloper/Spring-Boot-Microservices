package com.bibhuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/msg")
public class MsgController {

//	@GetMapping("/hello")
	@GetMapping(value= {"hello", "hi", "/"})
	public String msg(Model model) {
		model.addAttribute("msg", "Welcome msg controller");
		return "index";
	}
	
	@GetMapping("/hiResponse")
	@ResponseBody
	public String hello() {
		String msg = "Hello, how are you?";
		return msg;
	}
	
}
