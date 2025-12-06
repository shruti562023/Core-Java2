package CollectionInterface;

import java.util.*;

public class Task1 {
	
	public static void main(String[] args) {
		
		
		
		Collection c = new ArrayList();
		c.add("bura  dekho");
		c.add("bura  sunoo");
		c.add("bura  bolooooo");
		
		for(Object y : c) {
		System.out.println("Collection c= " +y);
		}
		
	System.out.println("Size  = "  +c.size());
	
	Object[] o =c.toArray();
		for(Object ele : o)
		{
		
		System.out.println("Array c= " +ele);
		}
		
		
	}

}
