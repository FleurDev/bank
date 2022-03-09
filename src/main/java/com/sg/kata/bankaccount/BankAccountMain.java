package com.sg.kata.bankaccount;

public class BankAccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		TransactionPrinter transactionPrinter = new TransactionPrinterImpl();
		
		try 
		{
			account.deposit(new Amount(50L));
			account.withdraw(new Amount(10L));
			account.deposit(new Amount(20L));
		
			account.withdraw(new Amount(100L));
		}
		 catch (InsufficientBalanceException | InvalidBankTransactionException e) {
			e.printStackTrace();
		}
		
		account.printTransactionHistory(transactionPrinter);
	}
}
