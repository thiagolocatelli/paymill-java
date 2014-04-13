package com.github.thiagolocatelli.paymill.exception;

public class AuthenticationException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public AuthenticationException(String error, String message) {
		super(error, message);
	}

}
