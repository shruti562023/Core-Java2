package encapsulation;

public class RectangleMain {
	
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		
		
		r.setLength(4);
		r.setWidth(4);
		
		System.out.println("length "+r.getLength());

		System.out.println("width "+r.getWidth());
		
		r.Area();
	}
	
	

}
