package in.co.rays.constructor;

public class Student {
	
	int roll;
	String name;
	

	
	Student(int roll , String name){
		
		this.roll=roll;
		this.name=name;
		
		
	}

	
		

	public static void main(String[] args) {
		
	Student s = new Student(1,"Chinuuu");	
	
	System.out.println(s.roll);
	System.out.println(s.name);
	
		
		
		
	}
}
