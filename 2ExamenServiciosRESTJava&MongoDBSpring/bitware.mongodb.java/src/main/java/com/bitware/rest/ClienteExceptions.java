package com.bitware.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ClienteExceptions extends RuntimeException{
	
	public ClienteExceptions(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public ClienteExceptions(Throwable message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
