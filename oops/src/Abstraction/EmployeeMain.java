package Abstraction;

public class EmployeeMain {
	
	
	public static void main(String args[]) {
		
Employee e = new Manager();
e.setName("Shruti");
System.out.println("manager name "+e.getName());

e.setSalary(20000);
System.out.println("manager salaryy "+e.getSalary());

e.calculateBonus();



Employee e1 = new Developer();
e1.setName("Sandeep");
System.out.println("developer name "+e1.getName());

e1.setSalary(15000);
System.out.println("developer salaryy "+e1.getSalary());

e1.calculateBonus();
	
	}

}
