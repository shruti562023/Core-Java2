package encapsulation;

public class StudentsMain {
	public static void main(String[] args) {
		
	
		Students s=new Students();
		
		
		s.setId(1);
		System.out.println("id "+s.getId());
		
		
		
		s.setName("Shruti Rathore");
		System.out.println("Name "+s.getName());
		
		
		
		s.setAge(21);
		System.out.println("Age "+s.getAge());
		
		
		
		s.setMarks(80);
		System.out.println("Marks "+s.getMarks());
		
		s.check();
		
	}

}
