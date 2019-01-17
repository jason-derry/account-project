package com.qa.persistence.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.persistence.Query;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Alternative
public class AccountMapRepository implements AccountRepository {
	
	HashMap<Integer, Account> account = new HashMap<>();
	int counter = 1;
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllAccounts() {
		String result = account.values().stream().map(Object::toString).collect(Collectors.joining(", "));
		return result;
	}
	
	@Override
	public String createAccount(String accountToAdd) {
		Account anAccount = util.getObjectForJSON(accountToAdd, Account.class);
		account.put(counter, anAccount);
		counter++;
		return null;
	}

	@Override
	public String updateAccount(Long id, String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
