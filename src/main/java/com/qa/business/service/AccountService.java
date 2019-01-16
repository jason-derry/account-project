package com.qa.business.service;

public interface AccountService {

	String retrieveAccounts();
	void addAccount(String account);
	int countFirstName(String name);

}