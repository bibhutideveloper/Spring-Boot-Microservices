package com.bibhuti.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/contact")
	public String contact() {
		return "call us :: 9876543210";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi, How are you?";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, How are you?";
	}
	
}
