package overloading;

public class Calculator {
	
	public void sub(String name) {
		
		System.out.println("name " + name);	
		
	}
	
	public void sub(int a , int b) {
		System.out.println("add " + (a+b));
	}
	
	
	public void sub(int id) {
		System.out.println("id " +id);
	}
	
	
	
	public static void main(String args[]) {
		
		Calculator c= new Calculator();
		
		c.sub("Shruti");
		c.sub(6,9);
		c.sub(5);
		
	}
	
	
	
	
	
	
	
	
	

}
