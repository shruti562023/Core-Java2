package string;

public class PalindroneString {
	
	public static void main(String[] args) {
		
	String str="madam"	;
	int len=str.length();
	boolean palindrome=true;
	
	for(int i=0;i<len/2;i++) {
		
		if(str.charAt(i)!=str.charAt(len-1-i)) {
			
			palindrome=false;
		
			
		}
	}
	
	if(palindrome) {
	System.out.println("String is  Palindrone");
	}
	else {
		System.out.println("String is  not  Palindrone");
		
	}
	}

}
