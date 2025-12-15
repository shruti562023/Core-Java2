//immutable class  with validation
package Encapsulation;

public  final class  Task1 {
	private final String name;
	private final int age;
	
	
	Task1(String name , int age) throws Task1Exception{
		
		if(age>=18) {
			System.out.println("you are elligible");
		}
		
		else {
			
			throw  new Task1Exception() ;
		}
		
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge(){
		return age;
	}

}
