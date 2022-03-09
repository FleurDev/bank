package com.sg.kata.bankaccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class BalanceTest {

	@Test
	public void should_update_balance_after_deposit() {
		final Balance actualBalance = new Balance(100L);
		final Balance balanceAfterDeposit = actualBalance.update(OperationType.DEPOSIT, new Amount(500L));
		final Balance expectedBalance = new Balance(600L);
		assertEquals(expectedBalance, balanceAfterDeposit);
	}
	
	@Test
	public void should_update_balance_after_withdrawal() {
		final Balance actualBalance = new Balance(1000L);
		final Balance balanceAfterWithdrawal = actualBalance.update(OperationType.WITHDRAWAL, new Amount(500L));
		final Balance expectedBalance = new Balance(500);
		assertEquals(expectedBalance, balanceAfterWithdrawal);
	}
	
	@Test
	public void should_throw_exception_if_operation_is_null() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			final Balance actualBalance = new Balance(1000L);
			final Balance balanceAfterWithdrawal = actualBalance.update(null, new Amount(500L));
		});
	}
}
