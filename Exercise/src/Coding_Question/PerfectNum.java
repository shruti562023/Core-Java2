
//perfect number
package Coding_Question;

public class PerfectNum {
	
	public static void main(String[] args) {
		
int sum=0;
		int num=6;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				
				sum=sum+i;
				
			}
			
		}
		
		if(sum==num) {
			
			System.out.println("perfect number");
			
		}
		else {
		System.out.println("not perfect");	
		}
		
		
	}

}
