package com.sg.kata.bankaccount;

import java.util.Objects;

public class Balance {

	private long balanceAfterOperation;

	public Balance(long balanceAfterOperation) {
		this.balanceAfterOperation = balanceAfterOperation;
	}

	public Balance update(final OperationType operationType, final Amount amount) {
		if(OperationType.DEPOSIT.equals(operationType)) {
			return new Balance(balanceAfterOperation + amount.getAmount());
		}else if (OperationType.WITHDRAWAL.equals(operationType)) {
			return new Balance(balanceAfterOperation - amount.getAmount());
		}
		throw new IllegalArgumentException("Operation is not supported");
	}

	@Override
	public int hashCode() {
		return Objects.hash(balanceAfterOperation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balance other = (Balance) obj;
		return balanceAfterOperation == other.balanceAfterOperation;
	}
}
