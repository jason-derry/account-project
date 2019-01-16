package com.qa.persistence.repository;

public interface AccountRepository {

	String retrieveAccounts();
	String addAccount(String account);
	int countFirstName(String name);

}