package com.qa.business.service;

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
		int count = (int) account.values().stream().filter(eachAccount -> eachAccount.getFirstName().toLowerCase().equalsIgnoreCase(name)).count();
		System.out.println(count);
		return count;
	}

}