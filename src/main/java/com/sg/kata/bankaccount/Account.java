package com.sg.kata.bankaccount;

public class Account {
	
	Balance balance = new Balance(0L);

	public void deposit(final Amount amount) throws InvalidBankTransactionException {
		if(amount.getAmount() < 0) {
			throw new InvalidBankTransactionException("Invalid Deposit Amount!");
		}
		balance = balance.update(OperationType.DEPOSIT, amount);
	}

	public void withdraw(final Amount amount) throws InsufficientBalanceException {
		if(this.balance.getBalanceAfterOperation() - amount.getAmount() < 0) {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
		balance = balance.update(OperationType.WITHDRAWAL, amount);
	}
	
	public Balance getBalance() {
		return balance;
	}
}
