package StreamTest;

import java.util.*;
import java.util.stream.Collectors;

public class ContestantMain {
	
	
	public static void main(String[] args) {
		ArrayList<Contestant> a=new ArrayList<Contestant>();
	
		a.add(new Contestant("Shruti" , "7879706591"));

		a.add(new Contestant("Chinu" , "7879767891"));

		a.add(new Contestant("Semi" , "78791"));

		a.add(new Contestant("Sandeep" , "706591"));

		a.add(new Contestant("Darsh" , "7879706591"));
		a.add(new Contestant("Darsh" , "7879706591"));

		a.add(new Contestant("Surbhi" , "706591"));
		
		
		
		
		a.forEach(System.out::println);
		
		System.out.println("------Get phone number--------");
		//Get phone number;
		a.stream().map(e->e.phone).forEach(System.out::println);;
		System.out.println("------Get valid phone number--------");
		//length limit
		a.stream().map(e->e.phone).filter(e->e.length()==10).forEach(System.out::println);
		
		System.out.println("------Get remove duplicate phone number--------");
		a.stream().map(e->e.phone).filter(e->e.length()==10).distinct().forEach(System.out::println);

		System.out.println("------Shuffle phone number--------");
		
		a.stream().map(e->e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
			
		Collections.shuffle(e);
		return e.stream();
		})).forEach(System.out::println);;
		
		
	}

}
