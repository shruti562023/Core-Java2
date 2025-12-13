package encapsulation;

public class ATMValidation {
	
	private int pin=1234;
	private double balance=3000;
	
	
	public boolean verify(int userpin) {
		 return userpin==pin;
		
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	
	public void Withdrawn(int amount) {
		if(amount>balance) {
			System.out.println("Insuffiecient balance");
		}
		
		else {
			balance=balance-amount;
			System.out.println("balance " +balance);
			
		}
		
	}
	

}
