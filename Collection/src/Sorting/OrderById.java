package Sorting;

import java.util.Comparator;

public class OrderById implements Comparator <Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
return o1.id-o2.id;
	}

}
