//maximum no in array
package Coding_Question;



public class MaxArray {
	
	public void maximum(int[] a) {
		
		int y=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(y<a[i]) {
				
				y=a[i];
			}
			
		}

		System.out.println("max "+y);
		}
	
	
		public static void main(String[] args) {
			
			MaxArray mx = new MaxArray();
			
			
			mx.maximum(  new int[] {10,20,98 ,56,87});
			
		}

}
