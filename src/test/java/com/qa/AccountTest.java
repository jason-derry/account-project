package com.qa;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	AccountService ac1 = new AccountService();
	
	@Test
	public void testHashMap() {
		assertTrue(ac1.account.isEmpty());
	}
	
	@Test
	public void testAddAccount() {
		ac1.addAccount("first", "last");
		assertEquals(1, ac1.account.size());
	}
	
	@Test
	public void testRetrieveAccount() {
		ac1.addAccount("first", "last");
		assertEquals("first last, ID: 1", ac1.retrieveAccount(1).toString());
	}

	@Test
	public void testRetrieveAccounts() {
		ac1.addAccount("first", "last");
		assertEquals("{\"1\":{\"firstName\":\"first\",\"lastName\":\"last\",\"accountNumber\":1}}", ac1.retrieveAccounts());
	}
	
	@Test public void testGetFirstName() {
		ac1.addAccount("first", "last");
		assertEquals("first", ac1.account.get(1).getFirstName());
	}
	
	@Test public void testGetLastName() {
		ac1.addAccount("first", "last");
		assertEquals("last", ac1.account.get(1).getLastName());
	}
	
	@Test public void testGetAccountNumber() {
		ac1.addAccount("first", "last");
		assertEquals(1, ac1.account.get(1).getAccountNumber());
	}
	
	@Test public void testCountFirstName() {
		fail("not yet implemented");
	}
	
}
