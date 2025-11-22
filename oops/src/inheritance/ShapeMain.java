package inheritance;

public class ShapeMain {
public static void main(String[] args) {
	
	
	Circle c= new Circle();
	System.out.println("---------------------------------------------------------------");
	c.setColor("Blue");
	System.out.println("circle color " +c.getColor());
	
	
	c.setBorder(2);
	System.out.println("circle border " +c.getBorder());
	
	c.setRadius(4);
	System.out.println("circle radius " +c.getRadius());
	
	
	c.area();
	
	System.out.println("---------------------------------------------------------------");
	
	
	
	Rectangle r= new Rectangle();
	System.out.println("---------------------------------------------------------------");
	r.setColor("red");
	System.out.println("rectangle color " +r.getColor());
	
	
	r.setBorder(2);
	System.out.println("rectangle border " +r.getBorder());
	
	r.setLength(4);
	System.out.println("rectangle length " +r.getLength());
	
	
	r.setWidth(4);
	System.out.println("rectangle width " +r.getWidth());
	
	r.area();
	
	System.out.println("---------------------------------------------------------------");
	
	
	
System.out.println("---------------------------------------------------------------");
	
	
	
	Triangle t= new Triangle();
	System.out.println("---------------------------------------------------------------");
	t.setColor("yellow");
	System.out.println("Triangle color " +t.getColor());
	
	
	t.setBorder(2);
	System.out.println("Triangle border " +t.getBorder());
	
	t.setBase(4);
	System.out.println("triangle  base " +t.getBase());
	
	
	t.setHeight(6);
	System.out.println("triangle height " +t.getHeight());
	
	t.area();
	
	System.out.println("---------------------------------------------------------------");
	
}
}
