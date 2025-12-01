package shruti.rathore;

public class Armstrong {
	
	public static void main(String[] args) {
		int num=1634;
		int temp=num;
		int rev=0;
		int rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rem*rem*rem*rem+rev;
			temp=temp/10;
			
			
		}
		
		if(num==rev) {
			System.out.print("Armstrongggggggggggg");			
			
		}
		
		else {
			System.out.print(" not Armstrongggggggggggg");	
		}
		
	}

}
