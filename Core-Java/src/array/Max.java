package array;

public class Max {
	public  static void main(String[] args) {
		
		int[] arr= {10,30,66,0};
		
		int y=arr[0];
		
		for(int i=0;i<arr.length;i++) {
		
			if(y>arr[i]) {
				
				y=arr[i];
				
			}
			
			
		}
		System.out.println(y);
	}

}
