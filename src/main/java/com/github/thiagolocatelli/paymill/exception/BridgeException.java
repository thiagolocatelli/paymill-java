package com.github.thiagolocatelli.paymill.exception;

public class BridgeException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public BridgeException(String error, String message) {
		super(error, message);
	}

}
