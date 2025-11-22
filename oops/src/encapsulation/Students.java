package encapsulation;

public class Students {
	private int id;
private String name;
private  int age;
private double marks;



public void setId(int id) {
	this.id=id;
	
}

public int getId() {
	
	return id;
}


public void setName(String name) {
	this.name=name;
	
}

public String getName() {
	return name;
}


public void setAge(int age) {
	
	this.age=age;
}


public int getAge() {
	
	return age;
}

public void setMarks(double marks) {
	this.marks=marks;
}


public double getMarks() {
	return marks;
}

	
public void check() {
	
	if(marks>50) {
		System.out.print("pass");
		
	}
	
	else {
		

		System.out.print("fail");
		
	}
}
	
	

}
