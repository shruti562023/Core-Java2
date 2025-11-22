package date;
import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpateDate {
	public static void main(String args[]) {
		
		Date d=new Date();
		
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(sd.format(d));
		
	}
	
	
	
	
}
