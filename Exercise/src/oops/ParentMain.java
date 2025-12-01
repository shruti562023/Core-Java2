package oops;

public class ParentMain {
public static void main(String[] args) {
	
	
	
Parent p = new Child();

p.hello(); // call parent
Child c=new Child();

c.hello();  // call child


Parent.hello();  //parent
Child.hello();//child
}
}
