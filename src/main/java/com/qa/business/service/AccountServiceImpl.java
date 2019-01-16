package com.qa.business.service;

import java.util.HashMap;

import javax.inject.Inject;

import com.google.gson.Gson;
import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;

	
	Gson gson = new Gson();
	
//	HashMap<Integer, Account> account = new HashMap<>();
//	
//	int counter = 1;
//	
//	@Override
//	public void addAccount(String firstName, String lastName) {
//		account.put(counter, new Account(firstName, lastName, counter));
//		counter++;
//	}
//	
//	@Override
//	public Account retrieveAccount(int accountNumber) {
//		return account.get(accountNumber);
//	}
	
	@Override
	public void addAccount(String account) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String retrieveAccounts() {
//		return gson.toJson(account);
		return repo.retrieveAccounts();
	}
	
	@Override
	public int countFirstName(String name) {
//		int count = (int) account.values().stream().filter(eachAccount -> eachAccount.getFirstName().toLowerCase().equalsIgnoreCase(name)).count();
//		System.out.println(count);
//		return count;
		return repo.countFirstName(name);
	}
}