public class App {

	public static void main(String[] args) {
		
//		System.out.println("Hello world to the standard out");
		
		AccountService ac1 = new AccountService();
		
		ac1.addAccount("Bob", "Jenkins", 1);
		ac1.addAccount("Jeff", "Jones", 2);
		ac1.addAccount("Jim", "Jerry", 43);
		
		System.out.println(ac1.retrieveAccount(1));
		System.out.println(ac1.retrieveAccount(2));
		System.out.println(ac1.retrieveAccount(43));

	}

}
