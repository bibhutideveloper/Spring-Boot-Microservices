package com.bibhuti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome Bibhuti.");
		
		mav.setViewName("messagePage"); // file name
		
		return mav;
	
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good evening.");
		mav.setViewName("messagePage"); // file name
		return mav;
	}
	
}
