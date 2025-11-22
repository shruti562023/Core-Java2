package string;

public class TestString {
	
	public static void main(String[] args) {
		
		String str="Shruti Rathore";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("r"));
		System.out.println(str.lastIndexOf("r"));
		
		System.out.println(str.startsWith("S"));
		System.out.println(str.endsWith("S"));
		System.out.println(str.substring(3,4));
		System.out.println(str.replace("S","y"));
		
		
	}

}
