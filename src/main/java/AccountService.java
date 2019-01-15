import java.util.HashMap;

public class AccountService {
	
	HashMap<Integer, Account> account = new HashMap<Integer, Account>();
	
	Account bob = new Account("Bob", "Jenkins", 1);
	
	public void addAccount() {
		account.put(bob.getAccountNumber(), bob);
	}
	
	public void addAccount(String firstName, String lastName, int accountNumber) {
		Account newAcc = new Account(firstName, lastName, accountNumber);
		account.put(newAcc.getAccountNumber(), newAcc);
	}
	
	public void retrieveAccount(int accountNumber) {
		System.out.println(account.get(accountNumber));
	}


}
