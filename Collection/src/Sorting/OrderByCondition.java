package Sorting;

import java.util.Comparator;

public class OrderByCondition implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {

		if (o1.name == o2.name && o1.salary == o2.salary) {

			return o1.id - o2.id;

		} 
		else if(o1.name==o2.name){
			return o1.salary - o2.salary;
			
		}

		return o1.name.compareTo(o2.name);
		
	}

}
