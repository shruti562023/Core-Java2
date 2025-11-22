package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocateDate {

	public static void main(String[] args) {
		
		
		
LocalDateTime l=LocalDateTime.now();


DateTimeFormatter dt= DateTimeFormatter.ofPattern("yyyy/MM/dd");
	String form=l.format(dt);
		
		System.out.print(form);
		
		
		LocalDate p=LocalDate.parse(form,dt);
		
		System.out.print(p);
		
		
		
		
		
	}
}
