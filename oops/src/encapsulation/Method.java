package encapsulation;



public class Method {
		
		public void sum(int a , int b) {
			
		System.out.println(a+b);	
			
		}
		
		public String text(String y) {
			return y;
			
			
		}
	public static void main(String[] args) {
		
		
		Method m=new Method();
		
		m.sum(4,5);
		
		System.out.print(m.text("chinu"));
		
		
	}

	}


