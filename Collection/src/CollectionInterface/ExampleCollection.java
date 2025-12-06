package CollectionInterface;

import java.util.*;

public class ExampleCollection {
	
	public static void main(String[] args) {
		
	Collection  c =new ArrayList();
	
		
		c.add(21);
		c.add("Shruti");
		c.add("hellooo");
		
		System.out.println("  List"  +c);
		
	
	
	for(Object y : c) {
System.out.println(y);


	}	
	
	
	
	
	System.out.println(c.size());
	
	System.out.println(c.remove("hellooo"));
	System.out.println(c.contains("hellooo"));
	
	System.out.println("List "  +c);
	Collection y=new ArrayList();
	System.out.println("List "  +!y.isEmpty());
	
	
	
	
	
	}
}
