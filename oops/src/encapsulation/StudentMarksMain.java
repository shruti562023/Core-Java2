package encapsulation;

public class StudentMarksMain {
	
public static void main(String[] args) {
	
	
	StudentMarks s=new StudentMarks();
	s.setName("Shruti");
	s.setHindi(78);
	s.setEnglish(90);
	s.setMaths(44);
	s.setScience(22);
	s.setSst(91);
	
	System.out.println("Name "+s.getName());
	System.out.println("Maths  "+s.getMaths());
	System.out.println("Sst "+s.getSst());
	System.out.println("Hindi "+s.getHindi());
	System.out.println("English "+s.getEnglish());
	System.out.println("Science "+s.getScience());
	
	System.out.println("Total percentage "+s.percent());
}

}
