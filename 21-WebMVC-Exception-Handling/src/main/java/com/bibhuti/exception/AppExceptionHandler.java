package com.bibhuti.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class AppExceptionHandler {
	
	Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleAE(NullPointerException ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "nullException";
	}
	
	@ExceptionHandler(value = NoResourceFoundException.class)
	public String handleAE(NoResourceFoundException ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "error404";
	}
	
	
}
