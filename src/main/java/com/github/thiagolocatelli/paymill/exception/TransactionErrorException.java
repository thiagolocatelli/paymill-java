package com.github.thiagolocatelli.paymill.exception;


public class TransactionErrorException extends PaymillException {

	private static final long serialVersionUID = 1L;

	public TransactionErrorException(String error, String message) {
		super(error, message);
	}
	
}
