package Polymorphism;

public class PolymorphismReturnType {
	
	public static void main(String[] args)  {
		Shape[] s = new Shape[3];
		
		s[0]=Shape.getShape(1);
		s[1]=Shape.getShape(4);
		s[2]=Shape.getShape(5);
		
		s[0].setColor("blue");
		System.out.println(s[0].getColor());
		System.out.println("Circle========================================================");
		Circle c= (Circle) s[0];
		
		c.setRadius(4);
		System.out.println(c.getRadius());
		
		
		System.out.println("Rectangle========================================================");
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(2);
		System.out.println(r.getLength());
		
		r.setWidth(2);
		
		System.out.println(r.getWidth());
		
		System.out.println("Triangle========================================================");
		
		
		Triangle t = (Triangle) s[2];
		t.setBase(3);
		System.out.println(t.getBase());
		t.setHeight(4);
		System.out.println(t.getHeight());
		
		
		System.out.println("Area of all shape========================================================");
		
		for(int i=0;i<s.length;i++) {
			s[i].area();
			
		}
		
	}

}
