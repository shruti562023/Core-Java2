package oops;

public class StaticPolymorphism {

		
		
		
		public void chinu() {
			System.out.println("chinuu");
		}
		
		public void  chinu(String name) {
			
			System.out.println("hello " +name);
		}
		public static void main(String[] args) {
			
			StaticPolymorphism sp=new StaticPolymorphism();
			
			
			sp.chinu();
			sp.chinu("shruti");
		
	}

}
