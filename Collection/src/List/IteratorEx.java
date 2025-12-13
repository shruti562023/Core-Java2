package List;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorEx {
	
	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList();
		a.add("shrutii");
		a.add('y');
		
		System.out.println("list "+a);
		
		Iterator t =a.iterator();
		
		
		while(t.hasNext()) {
			Object o = t.next();
			System.out.println("iterator "+o);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
