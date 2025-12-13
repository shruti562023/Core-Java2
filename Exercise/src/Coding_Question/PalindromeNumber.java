package Coding_Question;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		
		
		int num=7787;
		int temp=num;
		int rev=0,rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		
		if(num==rev) {
			System.out.println("palindrone number");
			
	
		
		}
		
		else {
			System.out.println(" not palindrone number");
		}
	}

}
