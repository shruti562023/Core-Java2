package in.co.rays.constructor;

public class Women {
	
	 String name;
 int age;
 
 private int id;
	
	Women(){
		
		System.out.println("Constructor");
		
		
	}
	
	
	Women(String name , int age , int id){
		this.name=name;
		this.age=age;
		this.id=id;
		
		
	}
	
	public int getId() {
		
		return id;
	}
	
	
	

}
