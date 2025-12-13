package Sorting;

import java.util.*;
import java.util.List;

public class StringTest {
	
	public static void main(String[] args) {
		
		
		
		String s="Shrutii";
		String s1="Varun";
		String s2="Rishabh";
		
	List li = new ArrayList();
	li.add(s);
	li.add(s1);
	li.add(s2);
	
	System.out.println("list "+li);
	
	
	Collections.sort(li);    //sort ascending order
	
	System.out.println(li);
	
	Collections.shuffle(li);
	
	
	
	System.out.println(li); // order not define
		
	}

}
