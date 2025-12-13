package StreamTest;

import java.util.*;

public class SortCCollection {
	
	public static void main(String[] args) {
	
		
		ArrayList <String> a=new ArrayList<String>();
		
		
		a.add("Shruti");
		a.add("Sandeep");
		a.add("Rishabh");
		a.add("Shruti");
		a.add("Semi");
		a.add("Chinu");
		a.add("Sandeep");
		
	a.forEach(System.out::println);
	System.out.println("------------------Sorted-------------------------------");
	
	a.stream().sorted().forEach(System.out::println);
	System.out.println("--------------------unique-----------------------------");
	
	a.stream().sorted().distinct().forEach(System.out::println);
	
	System.out.println("--------------------Start with S-----------------------------");

	a.stream().filter(e->e.startsWith("S")).forEach(System.out::println);
	
	System.out.println("--------------------Start with-----------------------------");
	
	a.stream().map(e->e.toLowerCase()).filter(e->e.startsWith("s")).distinct().sorted().forEach(System.out::println);
	
	
	}

}
