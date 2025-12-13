package Sorting;

public class MarkSheet {
	
	private String rollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	
	
	
	MarkSheet( String rollNo,String name,int physics , int chemistry,int maths){
		
		this.rollNo=rollNo;
		this.name=name;
		this.physics=physics;
		this.chemistry=chemistry;
		this.maths=maths;
		
	}
	
	public String toString() {
		
		return "rollNo =" +rollNo +"Name = " + name  + " physics = "+physics + " chemistry = " + chemistry + " maths ="  + maths ;
		
	}

}
