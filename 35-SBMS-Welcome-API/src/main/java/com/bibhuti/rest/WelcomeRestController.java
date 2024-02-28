package com.bibhuti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibhuti.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetFeignClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		// API Intercommunication with RestTemplate
		/*
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:3030/greet", String.class);
		String greetResponse = forEntity.getBody();
		*/
		
		// API Intercommunication with FeignClient
		String greetResponse = greetClient.invokeGreetApi();
		
		
		return greetResponse + ", Welcome Bibhuti";
	}
	
}
