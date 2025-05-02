package com.exceptionhandling;

public class InsufficientFundsException extends RuntimeException {
	public InsufficientFundsException(String msg) {
		super(msg);
	}
}
