package List;

import java.util.*;

public class Task2 {
	
	public static void main(String[] args) {
		
    		
		ArrayList l = new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("five");
		l.add(2,"four");
		
	System.out.println("all " +l);	
	
	
	String val =(String) l.get(2);
	System.out.println("hh ===   " +val);
	
	for(Object ele : l) {
		String str =(String) ele;
		System.out.println(str);
	}
	}

}
