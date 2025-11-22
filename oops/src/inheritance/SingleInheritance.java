package inheritance;

 class Animal {
	
	int id=1;
	public void animal() {
		
		System.out.println(" All Animals are so cute");
		
	}
}
	
	 class Dogs extends Animal{
		public void dog() {
		System.out.println("Dogs are  so cute");	
		}
		
	}
		
		public class SingleInheritance{
	public static void main(String[] args) {
		
		
		
			Dogs d=new Dogs();
			d.animal();
			d.dog();
		
			
			System.out.println(d.id);
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
