package Interface;

public class BusinessmanMain {
	   public static void main(String[] args) {
		   
		 /*  Richman r = new Businessnan();
	        r.earnMoney();
	        r.donation();
	        r.party();
	        
	        
	        SocialWorker s = new Businessnan();
	        
	        s.helpToOther();*/
		   
		   
		   
		   
		   //all method call
		   Businessnan n = new Businessnan();
		   n.earnMoney();
		   n.helpToOther();
		   n.party();
		   n.donation();
		   
		   
		   n.setName("Shrutii");
		   n.setId(5);
		   System.out.println(n.getName());
		   System.out.println(n.getId());
	   }

}
