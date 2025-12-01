package encapsulation;

public class MarksMain {
	
	public static void main(String[] args) {
		
		Marks m =new Marks();
		
		m.setArray(0, 33);
		m.setArray(1, 65);
		m.setArray(2, 89);
		
		System.out.println("marks:");
		
		for(int m1 : m.getArray()) {
			
			System.out.println(m1 + " ");
		}
		
		System.out.println("Total "  +m.total());
		System.out.println("Average "  +m.average());
		System.out.println("grade "  +m.grade());
	}
	
	

}
