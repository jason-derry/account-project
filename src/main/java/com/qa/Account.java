package com.qa;

public class Account {
	
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	Account (String firstName, String lastName, int accountNumber) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + ", ID: " + accountNumber;
	}
	

}
