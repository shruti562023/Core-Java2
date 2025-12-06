package Exception;

public class Account {
	
	private double balance;
	
	
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	
	
	public double getBalance() {
		
		
		return balance;
	}

	
	public void withdraw(double amount) {
		
	if(amount>balance) {
		
		throw new AccountException();
		
	}
	
	else {
		balance=balance-amount;
	}
	
	
	
	}
	
	
	
}
