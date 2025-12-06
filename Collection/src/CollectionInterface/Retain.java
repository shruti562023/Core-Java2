package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Retain {
	
	public static void main(String[] args) {
		
		
		Collection a = new ArrayList();
		Collection b = new ArrayList();
		
		
		a.add("Shrutii");
	  a.add("Sandeep");
	  
	  b.add("Chinuu");
	  b.add("Rishabh");
	  b.add("Sandeep");
		
	  
	  System.out.println("a = "+a);
	  
	  System.out.println("b = "+b);
		
	
		a.retainAll(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(a);
		
		
	}

}
