package number;

public class CountNum {

	public static void main(String args[]) {

		String str = "Shruti004";
		int count = 0;

		for(int i=0;i<str.length();i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
				
				count++;
			}
			
		}
		System.out.println("input digit" + str);
		System.out.println(count);

	}

}
