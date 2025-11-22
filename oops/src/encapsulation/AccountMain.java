package encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account();

		ac.setNumber("7879706591");
		ac.setType("Saving Account");
		ac.setBalance(17000.0);

		System.out.println("Number " + ac.getNumber());
		System.out.println("Type " + ac.getType());
		System.out.println("current balance: " + ac.getBalance());
		
		ac.deposit(500.0);
		ac.withdraw(20000.0);
        ac.paybill(100000.0);
	}

}
