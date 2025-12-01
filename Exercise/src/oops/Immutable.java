package oops;

public  final class Immutable {
	private final String name;
	private final int age;
	
	Immutable(String name , int age){
		this.age=age;
		this.name=name;
		
		
		
	}
	
	
	public String getName() {
		
		return name;
	}
	
	
	public int getAge() {
		
		return age;
	}

}
