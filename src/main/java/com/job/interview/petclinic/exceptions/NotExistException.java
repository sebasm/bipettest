package com.job.interview.petclinic.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotExistException extends RuntimeException {

	private static final long serialVersionUID = -4157295448622263619L;
	
	public NotExistException(String message) {
		super(message);
	}
	
	public NotExistException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
