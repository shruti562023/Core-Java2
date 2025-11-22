package string;

public class DuplicateString {
	   public static void main(String[] args) {
		   String str="SHrrutii";
		  
		//   String result="";
		   
		   for(int i=0;i<str.length();i++) {
			 //  int count=0;
			 /*  
			   if (result.indexOf(str.charAt(i)) != -1) { 
	                continue; 
	            }

			   */
			   for(int j=i+1;j<str.length();j++) {
				   if(str.charAt(i)==str.charAt(j)) {
					   
				System.out.println(str.charAt(i));
					   
					   
					   
				   }
				   
			   }
		   }
			 /*  
			   if(count>1) {
				   
				   result=result+str.charAt(i);
			   }
			   
		   }
		   
		   System.out.println(result);*/
		   
	   }

}
