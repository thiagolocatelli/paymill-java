package com.github.thiagolocatelli.paymill.exception;

public class APIException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public APIException(String message, Throwable e) {
		super(message, e);
	}

}
