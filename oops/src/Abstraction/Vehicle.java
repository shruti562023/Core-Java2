package Abstraction;

public abstract  class Vehicle {
	abstract void start();
	
	
	public void stop() {
		
		System.out.println("stop vehicle");		
	}
}

	
	class Car extends Vehicle{
		
public void start() {
	System.out.println("Car Start.......................");		
	
}

public void hello() {
	System.out.println("Car Start.......................");
	
}
	
	}
class Bike extends Vehicle{
	
	public void start() {
		
		System.out.println("Bike start..............");
	}
	
	
}
		
		
		

