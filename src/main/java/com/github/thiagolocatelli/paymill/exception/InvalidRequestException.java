package com.github.thiagolocatelli.paymill.exception;

public class InvalidRequestException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public InvalidRequestException(String error, String message) {
		super(error, message);
	}

}
