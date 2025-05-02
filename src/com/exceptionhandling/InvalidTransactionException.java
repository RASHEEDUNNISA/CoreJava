package com.exceptionhandling;

public class InvalidTransactionException extends Exception {
	public InvalidTransactionException(String msg) {
		super(msg);
	}
}
