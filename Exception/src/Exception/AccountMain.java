package Exception;

public class AccountMain {
	
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setBalance(3000);
		System.out.println("balancee " +a.getBalance());
		
		
		a.withdraw(6000);
	}

}
