package in.co.rays.constructor;

public class WomenMain {
	
	public static void main(String args[]) {
		
		Women w=new Women();
		
		Women w1=new Women("Shruti" , 21 , 1);
		
		
		System.out.println(w1.name);
		System.out.println(w1.age);
		System.out.println(w1.getId());
		
	}

}
