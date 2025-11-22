package string;

public class ToggleCase {
	
	public static void main(String[] args) {
		String str="ShRuTi";
		String r="";
		
		for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		
		if(Character.isUpperCase(c)) {
			
			r+=Character.toLowerCase(c);
			
		}	
		
		else {

			r+=Character.toUpperCase(c);
			
		}
			
			
			
			
			
			
			
			
		}
		
		System.out.print(r);
		
		
		
		
		
		
	}

}
