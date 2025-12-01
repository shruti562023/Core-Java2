package in.co.rays.constructor;

public class Book {
	private String title;
	private String author;
	
	
	Book(String title , String author){
		this.title=title;
		this.author=author;
		
	}
	
	public void hello() {
		System.out.println("Helloooooooooooooooooo");
		System.out.println("name = "+author +" , title = " + title);
	}
	
	
	
	public static void main(String[] args) {
		
		Book b =new Book("Love Story", "Shruti");
	
		b.hello();
		
	}
	
	

}
