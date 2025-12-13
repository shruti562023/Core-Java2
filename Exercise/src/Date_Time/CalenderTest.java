package Date_Time;

import java.util.Calendar;

public class CalenderTest {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		//current year
		System.out.print(c.get(Calendar.DATE));
		System.out.print(" ");
		System.out.print(c.get(Calendar.MONTH)+ 1);
		System.out.print(" ");
		System.out.println(c.get(Calendar.YEAR));
		System.out.println("--------------------- ");
		
		System.out.println("-------------------- ");

		
		c.add(Calendar.DATE, -2);
		c.add(Calendar.MONTH, -2);
		c.add(Calendar.YEAR, -2);

		System.out.println(
		    c.get(Calendar.DATE) + " " +
		    (c.get(Calendar.MONTH) + 1) + " " +
		    c.get(Calendar.YEAR)
		);
		//after 2 month 
		c.add(Calendar.DATE ,2);
		System.out.print(c.get(Calendar.DATE));
		System.out.print(" ");
		c.add(Calendar.MONTH ,2 );
		System.out.print(c.get(Calendar.MONTH));
		System.out.print(" ");
		c.add(Calendar.YEAR ,2 );
		System.out.println(c.get(Calendar.YEAR));
		
		
		
	
	}

}
