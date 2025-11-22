package Override;

public class Child1 extends Shape {
	
	
	private int age;
	
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public int getAge() {
		
		return age;
		
		
	}
	
	public void area(){
		System.out.println("Child1 " +age);
		
	}

}
