package encapsulation;

public class Automobile {
	
	
	private String color;
	private int speed;
	private String make;
	
	
	public void setColor(String color) {
		this.color=color;
	}

	
	public String getColor() {
		
		
		return color;
	}
	
	public void setSpeed(int speed) {
		
		this.speed=speed;
		
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setMake(String make) {
		this.make=make;
		
	}
	
	public String getMake() {
		
		return make;
	}
	
	
	public int changeGear(int g) {
		
		if(g>=1 && g<=5) {
			 System.out.print("Gear changed successfully! ");
			return g;
			
			
		}
		
		else {
			
			System.out.print("invalid gear");
			return g;
		}
	
		
		
	}
	
	
	public void accelator() {
		speed=speed+10;
		System.out.println("accelator  done " +speed);
	}
	
	
	public void brake() {
		if(speed>=10) {
		speed=speed-10;
		}
		
		else {
			
			speed=0;
		}
		System.out.println("Break lgaaaooo " + speed);
		
	}
	
	

	
	
}
