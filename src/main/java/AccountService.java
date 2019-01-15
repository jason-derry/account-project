import java.util.HashMap;

public class AccountService {
	
	HashMap<Integer, Account> account = new HashMap<Integer, Account>();
	
	Account bob = new Account("Bob", "Jenkins", 1);
	
	public void addAccount() {
		account.put(bob.getAccountNumber(), bob);
	}
	
	public Account addAccount(String firstName, String lastName, int accountNumber) {
		return account.put(accountNumber, new Account(firstName, lastName, accountNumber));
	}
	
	public Account retrieveAccount(int accountNumber) {
		return account.get(accountNumber);
	}

}