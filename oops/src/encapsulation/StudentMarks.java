package encapsulation;

public class StudentMarks {
	
	private String name;
	private int english;
	private int science;
	private int maths;
	private int hindi;
	private int sst;
	
	
public void setName(String name) {
	this.name=name;
	
	
}

public String getName() {
	return name;
	
}
	

public void setEnglish(int english) {
	this.english=english;
}


public int getEnglish() {
	
	return english;
	
}
	
public void setHindi(int hindi) {
	this.hindi=hindi;
}


public int getHindi() {
	
	return hindi;
	
}
public void setScience(int science) {
	this. science= science;
}


public int getScience() {
	
	return  science;
	
}
public void setSst(int sst) {
	this.sst=sst;
}


public int getSst() {
	
	return sst;
	
}

public void setMaths(int maths) {
	this.maths=maths;
}


public int getMaths() {
	
	return maths;
	
}
	
	
	public double percent() {
		return (hindi+science+sst+english+maths)/5.0;
		
	}
	
	

}
