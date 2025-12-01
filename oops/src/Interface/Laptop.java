package Interface;

public interface Laptop {
	
	public void price();
	public void ram();

}


class HP implements Laptop{
	
	
	public void price() {
		
		System.out.println("HP price is 50000");
	}
	
	
	public void ram() {
		System.out.println("HP ram is 8GB");
	}
}

class Dell implements Laptop{
	
	public void price() {
		
		System.out.println("Dell price is 70000");
		}
		
		
		public void ram() {
			System.out.println("Dell ram is 16GB");
		}
}