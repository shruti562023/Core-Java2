package Polymorphism;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public void setColor(String color) {
		
		this.color=color;
		
		
		
	}
	
	
	public String getColor() {
		return color;
		
	}
	
	
	public void setBorder(int borderWidth) {
		
		this.borderWidth=borderWidth;
	}

	
	public int getBorder() {
		return borderWidth;
	}
	
	public void area() {
		System.out.print("Areaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
	
	
	public static Shape getShape(int i) {
		if(i==1) {
			
			return new Circle();
		}
	if(i==2) {
			
			return new Rectangle();
		}
	if(i==3) {
		
		return new Triangle();
	}
	
	return new Shape();
		
		
	}
}
