package Exception;

public class Indexout {
	public static void main(String[] args) {
		
		
		int a[]= {67,8,0};
		String s="shruti";
		
		try {
		System.out.println(a[3]);
		}
		
	
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
			
		}
		
	try {
			

			System.out.println(s.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("arrayyy");
	}

}
