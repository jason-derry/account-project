package com.qa.business.service;

public interface AccountService {

	String getAllAccounts();

	String createAccount(String account);
	
	String updateAccount(Long id, String firstName, String lastName);

	String deleteAccount(Long id);

}