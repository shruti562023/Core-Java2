package Interface;

public interface A {
	
	public void call();
	
}



interface B{
	

	public void getup();
	
	
}


class Connect implements A ,B{
	
	public void call() {
		
		System.out.println("Call A");
	}
	
	public void getup() {
		System.out.println("getup B");
	}
	
	
	
}