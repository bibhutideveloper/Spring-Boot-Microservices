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
	public String hi() {
		return "hi bibhuti";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello bibhuti";
	}
}
