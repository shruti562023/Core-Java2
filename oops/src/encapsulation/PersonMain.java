package encapsulation;
import java.util.Date;
public class PersonMain {
	
	public static void main(String[] args) {
		
		
		Date d=new Date();
		Person p1=new Person();
		
		p1.setName("Chinu");
		
		System.out.println(p1.getName());
		
		p1.setDob(d);
		System.out.println(p1.getDob());
		
		
		p1.setAddress("Vijay nagar");
		
		System.out.println(p1.getAddress());
		
	}

}
