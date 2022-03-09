package com.sg.kata.bankaccount;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class TransactionHistory {
	
	private List<Transaction> transactions = new LinkedList<>();

	public void addTransaction(final OperationType operationType, 
							   final LocalDateTime date, 
							   final Amount amount, 
							   final Balance balance) 
	{
		this.transactions.add(new Transaction(operationType, date, amount, balance));
	}

	public void getTransactionHistoryDetail(final TransactionPrinter transactionPrinter) {
		transactions.stream().forEach(transaction -> transactionPrinter.print(transaction));
	}
}
