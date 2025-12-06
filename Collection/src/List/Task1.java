//Remove duplicate list

package List;
import java.util.*;

public class Task1 {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
	
		l.add("Shruti");
		l.add(5);

		
		l.add("Shruti");
		l.add(5);
		System.out.println("list add All :" +l );
		
		
		Set s =new HashSet(l);
	
		System.out.println(" remove Duplicate set :" +s );
		List l1=new ArrayList(s);
		System.out.println(" remove  duplicate list "+l1);
		
		
		
		
		
		
	}

}
