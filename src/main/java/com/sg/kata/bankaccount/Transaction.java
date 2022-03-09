package com.sg.kata.bankaccount;

import java.time.LocalDateTime;

public class Transaction {
	
	private OperationType operationType;
	private LocalDateTime dateTime;
	private Amount amount;
	private Balance balanceAfterOperation;
	
	public Transaction(OperationType operationType, 
			           LocalDateTime dateTime, 
			           Amount amount, 
			           Balance balanceAfterOperation) {
		this.operationType = operationType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.balanceAfterOperation = balanceAfterOperation;
	}
}
