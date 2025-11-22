package date;
import java.time.LocalDate;
public class Age {

	public static void main(String[] args) {
		 
		
		LocalDate y=LocalDate.now();
		LocalDate d= LocalDate.of(2004,6,5);
		
		System.out.println(y);
		System.out.println(d);
		
		
		System.out.print(y.getYear()-d.getYear());
		
	}
}
