package Sorting;

import java.util.Comparator;

public class OrderBySalary  implements Comparator <Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.salary-o2.salary;
	}

}
