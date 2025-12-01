package Abstraction;

public  abstract class Course {
	
abstract void duration();


public void courseName() {
	
	System.out.println("Java and Python");
}

}


class Java extends Course{
	
public void duration() {
	
	System.out.println("java dration : 8 months");
}
	
	
}


class Python extends Course{
	
public void duration() {
	
	System.out.println("Pyhthon  dration : 6 months");
}
}