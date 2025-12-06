package Map;

import java.util.*;

public class MapEx {
	
	public static void main(String[] args) {
		
		Map m =new HashMap();
		
		m.put(1,"Shruti");
		m.put(2,"Chinu");
		m.put(3, "Semi");
		m.put(4,"Sandeep");
		
		
		System.out.println("print all map = "+m);
		System.out.println("to get =" +m.get(4));
		
		System.out.println("contains  key = "  +m.containsKey(3));

		System.out.println("contains  value = "  +m.containsValue(3));
		
		
		System.out.println("entry set  key = "  +m.entrySet());
		

		System.out.println("key set  = "  +m.keySet());
		System.out.println("value set  = "  +m.values());
		
		System.out.println("remove  = "  +m.remove(2));
		System.out.println("print after removee  = "  +m);
		
		System.out.println("size =" +m.size());
	
	}

}
