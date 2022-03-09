package com.sg.kata.bankaccount;

public class InsufficientBalanceException extends Exception {
	
	String errorMessage;
	
	public InsufficientBalanceException(String message) {
		errorMessage = message;
	}
	
	public String getMessage() {
		return errorMessage;
	}
}
