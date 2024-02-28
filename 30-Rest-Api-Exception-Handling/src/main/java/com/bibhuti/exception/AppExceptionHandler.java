package com.bibhuti.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleException(UserNotFoundException e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX00001");
		info.setMsg(exMsg);
		info.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}	
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX00003");
		info.setMsg(exMsg);
		info.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
