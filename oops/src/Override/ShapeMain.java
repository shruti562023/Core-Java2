package Override;

public class ShapeMain {
	public static void main(String args[]) {
		
		
		Shape s = new Child1();
		Child1 c1 = (Child1) s;
		
		c1.setAge(21);
		System.out.println("age " +c1.getAge());
		
		c1.setColor("red");
		System.out.println("Color " +c1.getColor());
		
		
		
		Shape s1 = new Child2();
		Child2 c2 = (Child2) s1;
		
		c2.setSalary(20000001);
		System.out.println("Salary " +c2.getSalary());
		
		
		c2.setColor("blue");
		System.out.println("Color " +c2.getColor());
		
	}

}
