package com.sg.kata.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Balance {

	private long balanceAfterOperation;

	public Balance update(final OperationType operationType, final Amount amount) {
		if(OperationType.DEPOSIT.equals(operationType)) {
			return new Balance(balanceAfterOperation + amount.getAmount());
		}else if (OperationType.WITHDRAWAL.equals(operationType)) {
			return new Balance(balanceAfterOperation - amount.getAmount());
		}
		throw new IllegalArgumentException("Operation is not supported");
	}
}
