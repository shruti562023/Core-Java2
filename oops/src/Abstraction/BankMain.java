package Abstraction;

public class BankMain {
	
	public static void main(String args[]) {
		
	
		Bank b = new AxisBank();
		Bank b1 = new HDFC();
		
		b.BankName();
	
	  System.out.println("Axis "  +b.getInterestRate());
	  
	  b1.BankName();
	  b1.getInterestRate();	
	  System.out.println( "HDFC "  +b1.getInterestRate());
	
		
	}

}
