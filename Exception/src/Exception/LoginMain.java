package Exception;

public class LoginMain {
	
	public static void main(String[] args) throws LoginException {
		
		String name="Shruti";
		
		if(name=="Shrutsi") {
			System.out.println("name foundd");
			
		}
	
		else {
		
			throw new LoginException();
			}
		
		}
		


}



