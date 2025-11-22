package inheritance;

public class Bike {
	
	private String model;
	private  String color;
	private int price;
	
	public void setModel(String model) {
		
		this.model=model;
	}

	
	public String getModel() {
		
		return model;
	}
	
	
	public String getColor() {
		return color;
		
	}
	
	
	

	public void setColor(String color) {
		
		this.color=color;
	
}
	
	
	public void setPrice(int price) {
		
		this.price=price;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	
	
	public void start() {
		
		System.out.println(" starting");
	}
	
public void stop(int speed) {
	
		
		if(speed==0) {
			System.out.println("Stopped");
		}
		
		else {
			System.out.println("speed "+speed);
			
		}
		
		
		
	
	}


public void acclerate(int speed) {
	int acc=speed+10;
	System.out.println("Acceletator " +acc);
	
	
}


public void brake(int speed) {
	
	if(speed>10)
	{
	int brake=speed-10;
	System.out.println("Brake apply " +brake);
	}
	
	else {
		speed=0;
	}
}
	
}
