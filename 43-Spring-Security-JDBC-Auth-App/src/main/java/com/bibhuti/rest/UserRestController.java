package com.bibhuti.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/admin")
	public String admin() {
		return "<h3>Hello Admin</h3>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h3>Hello User</h3>";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "<h3>Welcome</h3>";
	}
	
}
