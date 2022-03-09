package com.sg.kata.bankaccount;

public class Account {
	
	Balance balance = new Balance(0L);

	public void deposit(final Amount amount) throws InvalidBankTransactionException {
		if(amount.getAmount() < 0) {
			throw new InvalidBankTransactionException("Invalid Deposit Amount!");
		}
		balance = balance.update(OperationType.DEPOSIT, amount);
	}

	public void withdraw(Amount amount) {
		balance = balance.update(OperationType.WITHDRAWAL, amount);
	}
	
	public Balance getBalance() {
		return balance;
	}
}
