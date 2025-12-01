package oops;

public abstract class Shape {
	abstract double area();

}


class Circle extends Shape{
	
	private double radius;
	
	 // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

	
	public void setRadius(double radius) {
		
		this.radius=radius;
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	
	public double  area() {
		
		return 3.14*radius*radius;

		
	}
	
	
	
}



class Rectangle extends  Shape{
	
	private double length;
	private double width;
	

	
	 // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
	
	
	public void setLength(int length) {
		
		this.length=length;
	}
	
	public double  getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public double getWidth() {
		
		return width;
	}
	
	
	public double  area() {
		
	return length*width;
	
	}
}