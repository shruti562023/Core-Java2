package Exception;

public class TestPropagationMain {

	
	public static void main(String[] args) {
		Hello h=new Hello();
		
		try {
		h.first();
		}
		
		catch(Exception e) {
		System.err.println(e.getMessage());	
		
	      System.out.println("Cause: " + e.getCause());
			
		}
		
	     System.out.println("Program continues...");
		
		
		
	}
}
