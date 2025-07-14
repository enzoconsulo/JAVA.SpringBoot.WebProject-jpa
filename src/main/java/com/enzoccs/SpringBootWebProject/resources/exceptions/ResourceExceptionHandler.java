package com.enzoccs.SpringBootWebProject.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.enzoccs.SpringBootWebProject.services.exceptions.DatabaseException;
import com.enzoccs.SpringBootWebProject.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		String erro = "Resource not Found!";
		HttpStatus httpstts = HttpStatus.NOT_FOUND;
		StandardError error = new StandardError(Instant.now(), httpstts.value(), erro, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(httpstts).body(error);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> databaseErr(DatabaseException e, HttpServletRequest request) {
		String erro = "Database Integrity error !";
		HttpStatus httpstts = HttpStatus.BAD_REQUEST;
		StandardError error = new StandardError(Instant.now(), httpstts.value(), erro, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(httpstts).body(error);
	}

}
