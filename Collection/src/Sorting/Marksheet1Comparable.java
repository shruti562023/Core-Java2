package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Marksheet1Comparable {
	
	public static void main(String[] args) {
		
	
		ArrayList al=new ArrayList();
		al.add(new Marksheet1("104","Shruti", 100));
		al.add(new Marksheet1("101","Sandeep", 60));
		al.add(new Marksheet1("105","Varun", 67));
		al.add(new Marksheet1("103","Rishabh", 28));
		al.add(new Marksheet1("102","Yashwant", 28));
		
		al.forEach(System.out::println);
		System.out.println("-------------------------After sorting----------------------");
		Collections.sort(al);
		al.forEach(System.out::println);	
	}

}
