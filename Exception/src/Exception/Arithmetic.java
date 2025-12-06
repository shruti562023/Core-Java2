package Exception;

public class Arithmetic {
	
	public static void main(String[] args) {
		
		int a=7;
		int b=0;
		try {
		int c=a/b;
		
		System.out.println("c  "+c);
		}
		
		catch(ArithmeticException  e) {
			System.out.println(e.getMessage());
			e.printStackTrace();  
			
		}
		System.out.println("finishhh");
		
	}

}
