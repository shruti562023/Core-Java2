package Abstraction;

public abstract  class Bank {
	
public abstract double getInterestRate();



	public void BankName() {
		
		System.out.println("RBI");	
		}
	
	


}


class AxisBank extends Bank{
	
	public double getInterestRate() {
		
		return 11.5;
	
		
		
	}
	
	

	
	
	
	
}


class HDFC extends Bank{
public double getInterestRate() {
		
		return 9.5;
	
		
		
	}
	
	
}