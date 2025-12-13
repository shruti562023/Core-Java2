package Sorting;

public class Marksheet1  implements Comparable<Marksheet1> {
	
	private String rollNo;
	private String name;
	private int physics;
	
	Marksheet1(String rollNo , String name , int physics){
		this.rollNo=rollNo;
		this.name=name;
		this.physics=physics;
		
	}
	
	

	@Override
	public int compareTo(Marksheet1 o) {
		
		//return this.physics-o.physics; //ascending
		return this.name.compareTo(o.name);
	}
	
	public String toString() {
		
		return "RollNo " +rollNo +" name  " +name +"   physics " +physics ; 
		
	}

}


