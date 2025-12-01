package Abstraction;

public abstract  class Shape {
abstract void area();
	
public void chinu() {
	System.out.println("chinuuuu");
	
}
	
	
	
}

class Circle extends Shape{
	
	

	@Override
	public void area() {
		int r=6;
	double result= 3.14 * r *r;
	System.out.println("circle "+result);
		
	}
	
}


class Rectangle extends Shape{
	public void area() {
		
		int l=3;
		int w=4;
		
		int result=l*w;
		System.out.println("rectangleee "+result);	
		
	}
	public void shruti() {
		System.out.println("Shruti");
		
	}
	
	
	
	
}
