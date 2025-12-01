package encapsulation;

public class Temperature {
	
	private double celcius;
	
	
	public void setMethod(double celcius) {
		
		if(celcius>=-273) {
			
			
			this.celcius=celcius;
		}
		 else {
	            System.out.println("Temperature cannot be below -273°C!");
	        }
		
	}
	
	public double getMethod() {
		
		return celcius;
	}
	
	public double getFahrenheit() {
		return (celcius*9/5)+32;
	}
	
	public  double getKelvin() {
		
		return celcius + 273.15;
	}

}





