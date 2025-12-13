package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEmployee1 {
	
	public static void main(String[] args) {
		
		
	ArrayList a = new ArrayList();
	a.add(new Employee1 (1,"Shruti" , 6000));
	a.add(new Employee1 (5,"Shruti" , 9000));
	a.add(new Employee1 (4,"Varun" , 2000));
	a.add(new Employee1 (2,"Sandeep" , 9000));
	a.add(new Employee1 (3,"Varun" , 600));
	a.add(new Employee1 (6,"Varun" , 600));
	a.add(new Employee1 (7,"Sandeep" , 600));
	a.add(new Employee1 (8,"Yashwant",2000));
		
	
	a.forEach(System.out::println);
	
	System.out.println("-------------sort----------------");
	Collections.sort(a);
	a.forEach(System.out::println);
		
	}

}
