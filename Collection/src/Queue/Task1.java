
//exit queue value one by one and store in another queue
package Queue;

import java.util.*;


public class Task1 {
public static void main(String[] args) {
	
	
Queue y1 =new ArrayDeque();
Queue y2=new ArrayDeque(y1);
	
	for(char c='a'; c<='z' ; c++) {
		y1.offer(c);
		
		
		
	}
	
	System.out.println("print " +y1);
	
while(!y1.isEmpty()) {
	 char removed = (char) y1.poll();
	
	y2.offer(removed);
			

	
}
	

	


System.out.println("After removing all elements, y1: " + y1);
System.out.println("Transferred Queue y2: " + y2);
	
}

}
