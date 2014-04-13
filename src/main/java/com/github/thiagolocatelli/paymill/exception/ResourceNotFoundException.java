package com.github.thiagolocatelli.paymill.exception;

public class ResourceNotFoundException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String error, String message) {
		super(error, message);
	}

}
