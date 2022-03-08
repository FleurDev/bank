package com.sg.kata.bankaccount;

public class Account {
	
	Balance balance = new Balance(0L);

	public void deposit(final Amount amount) {
		balance = balance.update(OperationType.DEPOSIT, amount);
	}
	
	public Balance getBalance() {
		return balance;
	}
}
