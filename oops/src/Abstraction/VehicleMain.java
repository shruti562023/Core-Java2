package Abstraction;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		Vehicle v = new Bike();
		Vehicle v1=new Car();
		Car c = (Car) v1;
		
		v.stop();
		v1.start();
		v.start();
		c.hello();
		
		
	} 

}
