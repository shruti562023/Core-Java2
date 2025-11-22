package shruti.rathore;

public class MaxArray {
	
	public static void main(String[] args) {
		
	int[] a= {10,78,7,90,66,5677,8998};
	
	
	int y=a[0];
	
	for(int i=0;i<a.length;i++) {
		
	
	if(y<a[i]) {
		
		
		y=a[i];
	}
	
	
	
	
	}
	
	
	System.out.println("Max array "+y);
	
}
}
