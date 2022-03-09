package com.sg.kata.bankaccount;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
	
	private OperationType operationType;
	private LocalDateTime dateTime;
	private Amount amount;
	private Balance balanceAfterOperation;

}
