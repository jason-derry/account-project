package com.qa.business.service;

import java.util.HashMap;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;
	
	@Override
	public String getAllAccounts() {
		return repo.getAllAccounts();
	}
	
	@Override
	public String createAccount(String account) {
		return repo.createAccount(account);
	}
	
	@Override
	public String updateAccount(Long id, String firstName, String lastName) {
		return repo.updateAccount(id, firstName, lastName);
	}
	
	@Override
	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}
	
}
//	Gson gson = new Gson();

//	public int countFirstName(String name) {
//		int count = (int) account.values().stream().filter(eachAccount -> eachAccount.getFirstName().toLowerCase().equalsIgnoreCase(name)).count();
//		System.out.println(count);
//		return count;
//		return (Integer) null;
//	}

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