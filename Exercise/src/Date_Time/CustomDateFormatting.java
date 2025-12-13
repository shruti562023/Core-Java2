package Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomDateFormatting {
	
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("current date "+d);
		
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String  formatted =dt.format(d);
				
				System.out.println(formatted);
				
			       LocalDate p = LocalDate.parse(formatted , dt);   // correct
			        System.out.println(p);  
				
	}
	
	

}
