//capitalize word
package Coding_Question;

public class Captitalize {

	
	public static void main(String[] args) {
		
		String str="sandeep";
		
		String result=str.substring(0,1).toUpperCase();
		String result1=str.substring(1).toLowerCase();
		System.out.println(result+result1);
		
		
		String str1="shruti rathore";
		String[] words=str1.split(" ");
		
		String results="";
		
		for(String w : words) {
			results+=w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase()+ " ";
			
		}
		System.out.println(results);
		
	}
}
