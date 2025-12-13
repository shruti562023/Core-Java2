//String is palindrome or not.................
package Coding_Question;
import java.util.*;
public class PalindromeString {
	
	public static void main(String[] args) {
		
		boolean palin=true;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.nextLine();
	
	
	int len=str.length();
	
	for(int i=0;i<len/2;i++) {
		if(str.charAt(i)!=str.charAt(len-i-1)) {
			
	 palin=false;
			
			
			
			
			
			
		}
		

	}

	
		if(palin) {
		System.out.println("palindrome");
	
		
		}
		
		else {
			
			System.out.println(" not palindrome");
		}
	}

}
