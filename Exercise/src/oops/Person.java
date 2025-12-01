package oops;

public class Person {
	String firstName;
	String lastName;
	
	
	
	
	 @Override
	    public String toString() {
	        return firstName + " " + lastName;
	        
	 }

	
	
	Person(String firstName , String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
}
