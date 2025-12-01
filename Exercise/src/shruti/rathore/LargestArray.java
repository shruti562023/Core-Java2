package shruti.rathore;

public class LargestArray{
	
	
public int  arrays(int a[]) {
		
		int max=a[0];
		
	for(int i=0;i<a.length;i++) {
		
		if(max<a[i]) {
			
			max=a[i];
		}
		

		
	}
	
	return max;
		
	}

	

	
	public static void  main(String[] args) {
		int[] b= {10,40,78,79};
		LargestArray l = new LargestArray();
		
	int result = l.arrays(b);
	System.out.println(result);
		
		
		
		
		
		
	}

}