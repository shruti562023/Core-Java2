package List;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeEx {
	
	public static void main(String[] args) {
		
		
	Vector v=new Vector();
	
	v.add('g');
	v.add("ghhg");
	
	System.out.println("vector "+v);
	
	
	Enumeration e=v.elements();
	
	
	v.add("chinu");   // fail safe
while(e.hasMoreElements()) {
	
	Object o =e.nextElement();
	
	System.out.println("vec "+o);
	
	
}
		
		
		
	}

}

