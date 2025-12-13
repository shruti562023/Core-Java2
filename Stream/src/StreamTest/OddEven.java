package StreamTest;

import java.util.*;

public class OddEven {
	
	public static void main(String[] args) {
		
		List <Integer> l=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			
			l.add(i);
		}
		
		
		l.stream().filter(e->e%2==0).forEach(System.out::println);
		
		
		
	}

}
