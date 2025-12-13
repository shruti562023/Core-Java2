package Date_Time;
import java.util.*;
import java.text.*;
public class DateFormatting {
	
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat s1=new SimpleDateFormat("dd/MM/yyyy");
		String change=s1.format(d);
		System.out.println(change);
		          
		

	Date y=s1.parse("15/08/1947");
		
		System.out.println(y);
	
				
		
		
		
	}

}
