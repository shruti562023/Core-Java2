package inheritance;

public class Student  extends Person{
	
	private  String rollNo;
	private int marks;
	
	
	
	public void setTotal(String rollNo , int marks) {
		
		this.rollNo=rollNo;
		this.marks=marks;
		
		
		
	}
	
	public String getRollNo() {
		
		return rollNo;
	}
public int getMarks() {
	
	return marks;
	
}
}
