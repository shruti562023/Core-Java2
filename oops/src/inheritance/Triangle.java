package inheritance;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	
	
public void setBase(int base) {
	this.base=base;
}

public int getBase() {
	
	return base;
}


public void setHeight(int height) {
	this.height=height;
}


public int getHeight() {
	return height;
}



public void area() {
	double Area=(0.5 *(height*base));
	
	System.out.println(Area);
	
   }
}
