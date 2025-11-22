package inheritance;

public class MenMain {
	
	public static void main(String[] args) {
		
		Men m = new Child1();
		
		Child1 c = (Child1) m;
		m.setId(1);
		System.out.println(m.getId());
		
		m.setName("Chinuu");
		System.out.println(m.getName());
		
		
		c.hello();
		System.out.println(c.age);
		
		c.area();
	}

}
