package Queue;

import java.util.*;

public class QueueEx {
	
	public static void main(String[] args) {
	Queue y =new ArrayDeque();
	
	y.add("chinu");
	
	y.add("yyuyu");
	
	System.out.println("queue "+y);
	
	System.out.println("queue "+y.peek());

	System.out.println("queue "+y.poll());
	

	System.out.println("queue "+y);
	
	
	

	System.out.println("-------------------------------");
	
	Queue y1 =new ArrayDeque();
	
	for(char c='a'; c<='z' ; c++) {
		y1.offer(c);
		
		
		
	}
	
	System.out.println("print " +y1);
	
	System.out.println("first " +y1.peek());
	
	System.out.println("print " +y1.poll());
	
	
	System.out.println("after remove a=== " +y1);
	
	
	}
	
	

}
