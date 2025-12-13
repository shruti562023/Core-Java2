package Date_Time;

import java.time.LocalDate;

public class Birthdate {
	
	public static void main(String[] args) {
		
		LocalDate l=LocalDate.of(2004, 06, 05);
		System.out.println("birthdate " +l);
		
		System.out.println("year "+l.getYear());
		System.out.println("Month "+l.getMonth());
		System.out.println("Day of month "+l.getDayOfMonth());
		System.out.println("Day of year "+l.getDayOfYear());
		System.out.println("year "+l.getDayOfWeek());
		
		
	}

}
