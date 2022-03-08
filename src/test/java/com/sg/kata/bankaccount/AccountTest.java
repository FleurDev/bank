package com.sg.kata.bankaccount;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountTest {
	
	private Account account;
	

	@Before
	public void init() {
		account = new Account();
	}
	
	@Test
	public void should_success_deposit_50()
	{
        long amount = 50L;
        account.deposit(new Amount(amount));
        Balance expectedBalance = new Balance(50L);
        assertEquals(expectedBalance, account.getBalance());
    }
}
