package date;
import java.util.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
public class SimpateDate {
	public static void main(String args[]) {
		
		ParsePosition d=new Date();
		
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String y=sd.format(d);
		System.out.println(y);
		Date p=sd.parse(y,d);
	System.out.println(p);
		
	}
	
	
	
	
}
