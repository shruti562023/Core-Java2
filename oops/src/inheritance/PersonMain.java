package inheritance;
import java.text.*;
public class PersonMain {
	
	public static void main(String[] args) throws ParseException {
		Businessman b = new Businessman();
		
		SimpleDateFormat sd= new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("----------------BusinessMan---------------------");
		b.setAll("Shruti" , " Indore" , sd.parse("2002-06-23"));
		System.out.println("BusinessMan name " +b.getName());
		System.out.println("BusinessMan Address " +b.getAddress());
		System.out.println("BusinessMan Date " +b.getDob());
		b.setIncome(10000);
		System.out.println("BusinessMan income " +b.getIncome());
		
		
		System.out.println("----------------Doctor---------------------");
		
		Docter  dr = new Docter();
		dr.setAll("Chinu" , " Rewa" , sd.parse("2003-02-21"));
		System.out.println("Doctor name " +dr.getName());
		System.out.println("Doctor Address " +dr.getAddress());
		System.out.println("Doctor Date " +dr.getDob());
		dr.setRegistraction("4566768866666666666666");
		System.out.println("Registration no " +dr. getRegistration());
		
		
		
	System.out.println("----------------Student--------------------");
		
		Student  s = new Student ();
		s.setAll("Sandeep" , " rajgarh" , sd.parse("2004-06-5"));
		System.out.println("Student  name " +s.getName());
		System.out.println("Student  Address " +s.getAddress());
		System.out.println("Student  Date " +s.getDob());
		s.setTotal("344454564", 66);
		System.out.println("Registration no " +s. getRollNo());
		System.out.println("Registration no " +s. getMarks());
		
	}

}
