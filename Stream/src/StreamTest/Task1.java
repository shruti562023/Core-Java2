package StreamTest;
import java.util.*;
public class Task1 {
int salary=0;
	
	
	public Task1(int salary) {
		this.salary=salary;
		
	}
	public static void main(String[] args) {
	
		
		List <Integer>a =new ArrayList<Integer>();
		a.add(60000);
		a.add(10000);
		a.add(60000);
		a.add(7000);
		a.add(9000);
		a.add(10000);
		
	
		
		System.out.println("------------Sorted Salary------------");
		
		a.stream().sorted().forEach(System.out::println);
		
		
		System.out.println("------------duplicate remove Salary------------");
		
		a.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("------------Higest Salary------------");
		a.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		System.out.println("------------Lowest Salary------------");
	a.stream().distinct().sorted().limit(1).forEach(System.out::println);
		System.out.println("------------2nd highest Salary------------");
	a.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
	System.out.println("------------2nd Lowest Salary------------");	
	
	a.stream().distinct().sorted().skip(1).limit(1).forEach(System.out::println);
	}

}
