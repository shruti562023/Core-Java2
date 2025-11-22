package encapsulation;

public class Account {
	private String number;
	private String type;
	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("total balane after deposite: " + balance);
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("insufficent fund transer");
		} else {
			balance = balance - amount;
			System.out.println("total balanve after withdrow: " + balance);
		}

	}
	public void paybill(double  bill) {
		if( bill>balance) {
			
			System.out.println("insufficent balance " +bill);
		}
		else {
		
		balance=balance-bill;
		System.out.println("bill paid after my balance "+balance);
		}
	}
}
