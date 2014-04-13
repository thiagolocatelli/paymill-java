package com.github.thiagolocatelli.paymill.exception;

public class APIConnectionException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public APIConnectionException(String error, String message) {
		super(error, message);
	}

	public APIConnectionException(String message, Throwable e) {
		super(message, e);
	}

}
