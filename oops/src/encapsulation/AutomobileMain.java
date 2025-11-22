package encapsulation;

public class AutomobileMain {
	
	public static void main(String[] args) {
		
		Automobile auto=new Automobile();
		
		auto.setColor("Blue");
		System.out.println("Color=" +auto.getColor());
		
		auto.setSpeed(100);
		System.out.println("Speed=" +auto.getSpeed());
		
		auto.setMake("Tata ");
		System.out.println("Make=" +auto.getMake());
		
		
		System.out.println("Gear=" +auto.changeGear(3));
		
		auto.accelator();
		auto. brake();
			
		
		
	}

}
