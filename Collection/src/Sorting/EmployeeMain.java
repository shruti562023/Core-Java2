package Sorting;

import java.util.*;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(1,"Shruti",6000);
	Employee e2 = new Employee(2,"Varun",9000);	
	Employee e3 = new Employee(3,"Rishabh",9000);	
	
ArrayList a=new ArrayList();
a.add(e1);
a.add(e2);
a.add(e3);
System.out.println("list "+a);

		
	System.out.println("----------foreach-------------");	
	
	for(Object o : a) {

System.out.println("list using foreach "+o);
		
	}
	
	

	System.out.println("----------Iterator-------------");	
	
	
	Iterator i=a.iterator();
	
	while(i.hasNext()) {
		
		Object s = i.next();
		System.out.println("list using iterator " +s);
		
		
	}
	
	
	}

}
