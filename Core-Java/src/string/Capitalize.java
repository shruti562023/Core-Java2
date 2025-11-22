package string;

public class Capitalize {
	
	public static void main(String[] args) {
		
		
		String str="shruti rathore";
		String result="";
		String[] words=str.split(" ");
		
		for(String w:words) {
		String str1=w.substring(0,1).toUpperCase();
		String str2=w.substring(1).toLowerCase();
	result+=str1+str2+" ";
		
		
		}
		System.out.print(result);
		
	}

}
