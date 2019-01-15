public class App {

	public static void main(String[] args) {
		
//		System.out.println("Hello world to the standard out");
		
		AccountService ac1 = new AccountService();
		
		ac1.addAccount();
		ac1.addAccount("Jeff", "Jones", 2);
		ac1.addAccount("Jim", "Jerry", 43);
		
		ac1.retrieveAccount(1);
		ac1.retrieveAccount(2);
		ac1.retrieveAccount(43);

	}

}
