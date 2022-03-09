package com.sg.kata.bankaccount;

import java.time.format.DateTimeFormatter;

public class TransactionPrinterImpl implements TransactionPrinter{

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public void print(final Transaction transaction) {
		System.out.println("Type of operation: "+ transaction.getOperationType()+
				", Amount: "+ transaction.getAmount().getAmount()+ 
				", Date: "+ transaction.getDateTime().format(formatter) +
				", Balance After Operation: "+ transaction.getBalanceAfterOperation().getBalanceAfterOperation());
	}

}
