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
	
	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public Balance getBalanceAfterOperation() {
		return balanceAfterOperation;
	}

	public void setBalanceAfterOperation(Balance balanceAfterOperation) {
		this.balanceAfterOperation = balanceAfterOperation;
	}
}
