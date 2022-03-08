package com.sg.kata.bankaccount;

public class InvalidBankTransactionException extends Exception {

	String errorMessage;
	
	public InvalidBankTransactionException(String message) {
		errorMessage = message;
	}
	
	public String getMessage() {
		return errorMessage;
	}
}
