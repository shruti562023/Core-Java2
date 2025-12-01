package Abstraction;

public abstract class Employee {
	private String name;
    private int salary;
	
	
	abstract void calculateBonus();
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}



class Manager extends Employee{
	
	public void calculateBonus() {
		int bonus=8;
		int result= (getSalary() * bonus )/100;
		System.out.println("manager "+result);
		
		
	}
	

	
	
}


class Developer extends Employee{
	public void calculateBonus() {
		
		int bonus=4;
		int result=(getSalary()*bonus)/100;
		System.out.println("developer "+result);
		
	}
	
	
}