
//sum of all integer grater than 100 less than 200 divisible by 7;
package conditional;

public class SumInteger {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0;i<=1000;i++) {
			if((i>=100 ) && (i<=200) && (i%7==0)) {
			
				sum=sum+i;
				
				
			}	
		}
		System.out.println(sum);
		
		
		
		
	}
}
