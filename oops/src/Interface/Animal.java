package Interface;

public interface Animal {
void sound();
void eat();
}


class Dog implements Animal{
	
	public void sound() {
		
	System.out.println("Dog barkkkkkkkkkkkk");	
		
	}
	
	public void eat() {
		System.out.println("Dog eat bones");	
		
	}

	


	
}





class Cat implements Animal{
	
	
	public void sound() {
		System.out.println("cat meaoww");		
	}
	
	
	public void eat() {
		System.out.println("cat eat fishh");	
	}
}






