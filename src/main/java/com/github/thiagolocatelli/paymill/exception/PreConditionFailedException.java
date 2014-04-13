package com.github.thiagolocatelli.paymill.exception;


public class PreConditionFailedException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public PreConditionFailedException(String error, String message) {
		super(error, message);
	}
	
}
