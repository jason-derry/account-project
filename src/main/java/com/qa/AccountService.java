package com.qa;

import java.util.HashMap;

public class AccountService {
	
	HashMap<Integer, Account> account = new HashMap<Integer, Account>();
	
	int counter = 1;
	
	public void addAccount(String firstName, String lastName) {
		account.put(counter, new Account(firstName, lastName, counter));
		counter++;
	}
	
	public Account retrieveAccount(int accountNumber) {
		return account.get(accountNumber);
	}

}