package Thread_Package;

public class TextRunnableMain {
	
	
	public static void main(String[] args) {
		
		
		
		
		Thread t1=new Thread(new TextRunnable("Shruti"));
		
		Thread t2=new Thread(new TextRunnable("Surbhi"));
		
		t1.start();
		t2.start();
		
		
		
	}

}
