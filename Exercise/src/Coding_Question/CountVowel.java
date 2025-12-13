package Coding_Question;

public class CountVowel {

	
	public static void main(String[] args) {
	String str="shr";
	
	int count=0;
	
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		
		if(c=='a'||c=='e'||c=='i'||c=='o' || c=='u') {
			
			count++;
			
		}
		
	}
	System.out.println("vowel is " +count);
	
	}
}
