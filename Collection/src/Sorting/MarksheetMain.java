package Sorting;
import java.util.*;
public class MarksheetMain {
	
	public static void main(String[] args) {
		
		
		MarkSheet ms1 = new MarkSheet("21ADV3CSE0231" , "Shruti Rathore " , 67,78,55);
		MarkSheet ms2 = new MarkSheet("21ADV3CSE0232" , "Sandeep Patel " , 70,80,9);
		MarkSheet ms3 = new MarkSheet("21ADV3CSE0233" , "Rishabh Jain" , 9,85,35);
		MarkSheet ms4 = new MarkSheet("21ADV3CSE0234" , "Varun Dhawan " , 67,80,36);
		
		ArrayList a = new ArrayList();
		a.add(ms1);
		a.add(ms2);
		a.add(ms3);
		a.add(ms4);
		
		
		System.out.println(a);
		
		Iterator it=a.iterator();
		
		while(it.hasNext()) {
		Object o = it.next();
		
		System.out.println(o);
	}
	}

}
