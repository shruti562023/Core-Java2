package Thread_Package;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		
		TextThreads t1=new TextThreads("Shrutii");
		TextThreads t2=new TextThreads("Sandeep");
		
		t1.start();
		t2.start();
		
		

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + "Akbar");
		}
	}

}
