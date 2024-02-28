package com.bibhuti.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/welcome")
	public String welcome() {
		String msg = "Welcome to Rest API...";
		return msg;
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		String msg = "Good morning...";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save() {
		String responseBody = "Welcome to Rest API...";
		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
	}
}
