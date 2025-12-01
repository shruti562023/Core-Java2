package encapsulation;

public class Marks {
	
	
	private int[]  mark=new int[3];
	
	
	public void setArray(int index ,int value) {
		if(index>=0 && index<mark.length) {
		if(value>=0 && value<=100) {
			
			
			mark[index]=value;
		}
		else {
            System.out.println("Invalid mark: " + value);
		}
		}
		 else {
	            System.out.println("Invalid index: " + index);
	        }
		
	}
	
	public int[] getArray() {
		
		return mark;
		
	}
	
	
	public int total () {
		
		int sum=0;
		for(int m : mark) {
			
			sum=sum+m;
		}
		
		
		return sum;
		
	}
	
	
	public double average() {
		
		return total() /(double) mark.length;
	}
	
	
	public String grade() {
		double avg=average();
		
		if(avg>=90) return "A grade";
		else if(avg>=75)  return "B grade";
		else if (avg>=35) return "C grade";
		
		else {
		return "Fail";
	}
	}

}
