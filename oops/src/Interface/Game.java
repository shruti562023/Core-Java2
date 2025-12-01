package Interface;

public interface Game {
	
	public void rules();
	public void play();
	
	

}

class Cricket implements Game{
	
	
	
	public void rules() {
		
		System.out.println("cricket rule :  A team must have 11 players");		
	}
	
	public void play() {
		
		System.out.println("play cricket");
	}
}
	
	class Football implements Game{
		
		public void play() {
			System.out.println("play football");	
			
		}
		
		public void rules() {
			System.out.println("Football rule : A team has 11 players including goalkeeper");
			
		}
	}
		
	
	
	
	
	




