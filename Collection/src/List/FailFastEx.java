package List;

import java.util.*;

public class FailFastEx {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("shrutii");
		a.add('y');
		
		System.out.println("list "+a);
		
		Iterator t =a.iterator();
	//fail fast 	a.add("shruti");	

		
		
		
		
		while(t.hasNext()) {
			// t.remove();     java.lang.illegalstate  exception
			Object o = t.next();
			System.out.println("iterator "+o);
			t.remove();
			
		}
		a.add("shruti");
		System.out.println("list "+a);
		
	}

}
