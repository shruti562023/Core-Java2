package array;

public class UniqueArray {
	
	public static void main(String[] args) {
		
		int a[]= {20,67,89,20,77,89};
		

	
	
	
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
		
		if(a[i]==a[j]) {
			
			count++;
		}
		
		
		
	}
		
		if(count == 1) {
		   
		    System.out.println(a[i]);
		}
		
	}
	
	

	}
	}
