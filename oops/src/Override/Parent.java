package Override;

public class Parent {
	
	public void message() {
		System.out.println("parent");
	}

}



class Child extends Parent{
	
	public void message() {
		System.out.println("Child ");
	}
	
	public void hello() {
		System.out.println("hello");
	}
}