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
		ac1.addAccount("Jeff", "Bridges");
		ac1.addAccount("Jeremy", "Kyle");
		ac1.addAccount("Jeff", "Dunham");
		ac1.addAccount("Jeremy", "Clarkson");
		ac1.addAccount("Jeff", "Bezos");
		ac1.addAccount("Michael", "Scarn");
		ac1.addAccount("Jeff", "Goldblum");
		
		assertEquals(4, ac1.countFirstName("jeff"));
	}
	
	@Test public void testCountFirstName2() {
		ac1.addAccount("Jeff", "Bridges");
		ac1.addAccount("Jeremy", "Kyle");
		ac1.addAccount("Jeff", "Dunham");
		ac1.addAccount("Jeremy", "Clarkson");
		ac1.addAccount("Jeff", "Bezos");
		ac1.addAccount("Michael", "Scarn");
		ac1.addAccount("Jeff", "Goldblum");
		
		assertEquals(2, ac1.countFirstName("jeremy"));
	}
	
	@Test public void testCountFirstName3() {
		ac1.addAccount("Jeff", "Bridges");
		ac1.addAccount("Jeremy", "Kyle");
		ac1.addAccount("Jeff", "Dunham");
		ac1.addAccount("Jeremy", "Clarkson");
		ac1.addAccount("Jeff", "Bezos");
		ac1.addAccount("Michael", "Scarn");
		ac1.addAccount("Jeff", "Goldblum");
		
		assertEquals(4, ac1.countFirstName("michael"));
	}
	
}
