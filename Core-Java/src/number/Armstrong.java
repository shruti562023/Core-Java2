package number;

public class Armstrong {

	
	public static void main(String[] args) {
		
		int num = 1531;
		
	 int rev=0;
	 int rem;
	 int temp=num;
	 
		while(temp!=0) {
			
			rem=temp%10;
			rev=rem*rem*rem*rem+rev;
			temp=temp/10;
			
		}

		if(rev==num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}
}
