package com.qa;

import java.util.HashMap;

import com.google.gson.Gson;

public class AccountService {
	
	Gson gson = new Gson();
	
	HashMap<Integer, Account> account = new HashMap<>();
	
	int counter = 1;
	
	public void addAccount(String firstName, String lastName) {
		account.put(counter, new Account(firstName, lastName, counter));
		counter++;
	}
	
	public Account retrieveAccount(int accountNumber) {
		return account.get(accountNumber);
	}
	
	public String retrieveAccounts() {
		return gson.toJson(account);
	}
	
	public int countFirstName(String name) {
		int count = 0;
		
		for(int i = 1; i < counter; i++) {
			if (name.toLowerCase().equals(account.get(i).getFirstName().toLowerCase())) {
				count++;
			}
		}
		
		System.out.println(count);
		return count;
	}

}