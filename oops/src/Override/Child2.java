package Override;

public class Child2 extends Shape {
	
	
	private int salary;
	
	
	public void setSalary(int salary) {
		
		this.salary=salary;
	}
	
	public int getSalary() {
		
		return salary;
		
		
	}
	
	public void area(){
		System.out.println("Child2 " +salary);
		
	}

}
