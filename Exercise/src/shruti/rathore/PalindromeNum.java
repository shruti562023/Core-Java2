package shruti.rathore;

public class PalindromeNum {
	public static void main(String args[]) {
		
		int num=12111;
		int rev=0 , rem , temp=num;
		while(temp>0) {
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;

			
			
		}
		
		if(num==rev) {
			System.out.print("palindrome");
		}
		
		else {
			System.out.print(" not palindrome");
		}
		
	}
}
