package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEmployee2 {
	
	public static void main(String[] args) {
		
	ArrayList a=new ArrayList();	
	a.add(new Employee2 (7 , "Shruti" , 878));
		a.add(new Employee2 (1 , "Shruti" , 787878));
		a.add(new Employee2 (5 , "Chinu" , 70000));
		a.add(new Employee2 (3 , "Shivam" , 90000));
		a.add(new Employee2 (4 , "Shruti" , 3490));
		a.add(new Employee2 (2 , "Semi" , 787878));
		
		a.add(new Employee2 (8 , "Shruti" , 3490));
		a.add(new Employee2 (6 , "Semi" , 787878));
	a.forEach(System.out::println);
	
	System.out.println("------------------------order by name-----------------------");
	
	OrderByName byName=new OrderByName();
	Collections.sort(a,byName);

	a.forEach(System.out::println);
	
	System.out.println("------------------------order by id-----------------------");
	
	OrderById byId=new OrderById();
	Collections.sort(a,byId);

	a.forEach(System.out::println);
	System.out.println("------------------------order by salary-----------------------");
	OrderBySalary bySalary=new OrderBySalary();
	Collections.sort(a,bySalary);

	a.forEach(System.out::println);

	System.out.println("------------------------order byCondition   salary-----------------------");
	
	
	OrderByCondition oc=new OrderByCondition();
	Collections.sort(a,oc);
	a.forEach(System.out::println);
	}

}
