package com.qa;

public class App {

	public static void main(String[] args) {
				
		AccountService ac1 = new AccountService();
		
		ac1.addAccount("Bob", "Jenkins");
		ac1.addAccount("Jeff", "Jones");
		ac1.addAccount("Jim", "Jerry");

	}

}
