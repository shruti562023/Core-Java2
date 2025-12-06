package Exception;

public class TestPropagation extends Exception {
	TestPropagation(String msg){
		
		super(msg);
	}
	
}

	class Hello {
	 void first() throws TestPropagation {
		 

	        System.out.println("Inside first()");
		System.out.println("first");
		try {
		second();
		}
		
		catch(TestPropagation e) {
			System.err.println(e.getMessage());
			
		}
	}

	
void second() throws TestPropagation {

    System.out.println("Inside second()");
		
		throw new TestPropagation("second exception");
	}
	
	
	

}