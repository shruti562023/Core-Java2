package Set;
import java.util.*;
public class SortedSetTask {
	
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		
		s.add("Aaisha");
		s.add("Shruti");
		s.add("Chinu");
		s.add("three");
		s.add("shruti");
		s.add("fffg");
		
		for(Object y : s) {
				System.out.println("Sorted= " +y);
				
				
			
		}
		
		System.out.println("first= " +s.first());
		
		
		System.out.println("last= " +s.last());
	}

}
