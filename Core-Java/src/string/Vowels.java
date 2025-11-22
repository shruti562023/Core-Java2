package string;

public class Vowels {

	
	public static void main(String[] args) {
		
		String str ="Shruti";
		int count=0;
		
		System.out.println(str);
		
		
		for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
					
	if(c == 'a'||c=='e' ||c=='i' || c=='o' || c=='u' ) {
						
				count++;		
						
						
					}
	
		}
		
		System.out.println("vowels total is =" + count);
		
		
		
	}
	
}
