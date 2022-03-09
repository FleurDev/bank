package com.sg.kata.bankaccount;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Account {
	
	private TransactionHistory transactionHistory = new TransactionHistory();
	private Balance balance = new Balance(0L);

	public void deposit(final Amount amount) throws InvalidBankTransactionException {
		if(amount.getAmount() < 0) {
			throw new InvalidBankTransactionException("Invalid Deposit Amount!");
		}
		balance = balance.update(OperationType.DEPOSIT, amount);
		transactionHistory.addTransaction(OperationType.DEPOSIT, LocalDateTime.now(), amount, balance);
		
	}

	public void withdraw(final Amount amount) throws InsufficientBalanceException {
		if(this.balance.getBalanceAfterOperation() - amount.getAmount() < 0) {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
		balance = balance.update(OperationType.WITHDRAWAL, amount);
		transactionHistory.addTransaction(OperationType.WITHDRAWAL, LocalDateTime.now(), amount, balance);
	}

	public void printTransactionHistory(final TransactionPrinter transactionPrinter) {
		transactionHistory.getTransactionHistoryDetail(transactionPrinter);
	}
}
