package encapsulation;

public class TemperatureMain {
	
	public static void main(String[] args) {
		
		
		Temperature t = new Temperature();
		
		t.setMethod(25.0);
		System.out.println("celcius "+t.getMethod() +"°C");
		System.out.println("fahrehnet "+t.getFahrenheit() +"°F");
		System.out.println("kelvin "+t.getKelvin() +"K");
		
	}

}
