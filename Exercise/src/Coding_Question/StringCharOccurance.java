package Coding_Question;

public class StringCharOccurance {
	
	public static void main(String[] args) {
		
		String str="Sandeep";
		for(int i=0;i<str.length();i++) {
			int count=0;
			
			//skip
			boolean skip=false;
			for(int k=0;k<i;k++) {
				if(str.charAt(k)==str.charAt(i)) {
			skip=true;
			break;
				}
			}
			
			if(skip) {
				continue;
			}
			
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			System.out.println(str.charAt(i)+" "+count);
		}
	}

}
