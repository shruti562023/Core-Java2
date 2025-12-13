package Date_Time;

import java.time.LocalDate;

public class AgeCal {
	
	public static void main(String[] args) {
		
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		
		LocalDate d1=LocalDate.of(2004, 06, 05);
		System.out.println(d1);
		
		int date1=d.getYear();
		int date2=d1.getYear();
		System.out.println("Age " +(date1-date2));
				
	}

}
