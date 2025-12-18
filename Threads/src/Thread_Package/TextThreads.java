package Thread_Package;

public class TextThreads extends Thread{
	
private String name;


TextThreads(String name){
	
	this.name=name;
	
}

public void run() {
	
	
	for(int i=0;i<=10;i++) {
		
		try {
			
			Thread.sleep(1000);
		}
		
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " = " + name);
	}
}




}
