package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestLocalDate {
	
	public static void main(String[] args) {
		
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		
		LocalDateTime t=LocalDateTime.now();
		System.out.println(t);
	}

}


