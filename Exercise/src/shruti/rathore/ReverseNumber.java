package shruti.rathore;

public class ReverseNumber {
	public static void main(String args[]) {
		
		int num=128908;
		
		int temp=num;
		int rev=0;
		int rem;
		
		while(temp>0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		System.out.println(rev);
		
		
		
	}

}
