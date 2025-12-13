package encapsulation;

public class ATMValidationMain {
	
	public static void main(String[] args) {
		
	ATMValidation a=new ATMValidation();
	
	
	
	
if(a.verify(123)) {
	
	a.Withdrawn(400);
	System.out.println(a.getBalance());
	
}

else {
	System.out.println("Wrong pin number");
}
		
	}

}
