package inheritance;

public class BikeMain {
	
	public static void main(String[] args) {
		
		
		SportsCar sc=new SportsCar();
		
		System.out.println("-----------bike----------------");
		sc.setModel("Apache");
		System.out.println(" bike model " +sc.getModel());
		
		sc.setColor("Blue");
		System.out.println(" bike color " +sc.getColor());
		
		
		sc.setPrice(200000);
		System.out.println(" bike price " +sc.getPrice());
		
		
		
		sc.start();
		
		sc.stop(0);
		
		sc.acclerate(50);
		
		sc.brake(50);
		
		
		System.out.println("-----------Car----------------");
		
		
		sc.setEngine("petrol");
		System.out.println(" car Engine  " +sc.getEngine());
		
		
	
		
		sc.setModel("BMW");
		System.out.println(" car model " +sc.getModel());
		
		
		sc.setColor("red");
		System.out.println("car color " +sc.getColor());
		
		
		sc.setPrice(150000);
		System.out.println(" car price " +sc.getPrice());
		
		
		
		sc.start();
		
		sc.stop(100);
		
		sc.acclerate(20);
		
		sc.brake(20);
		
System.out.println("-----------Sport Car----------------");



        sc.setEngine("Electric");
         System.out.println(" Sportcar Engine  " +sc.getEngine());
		
		
		sc.setModel("Ferrari 488");
		System.out.println(" Sportcar model " +sc.getModel());
		
		
		sc.setColor("pink");
		System.out.println("Sportcar color " +sc.getColor());
		
		
		sc.setPrice(50000000);
		System.out.println(" Sportcar price " +sc.getPrice());
		
		
		
		sc.start();
		
		sc.stop(30);
		
		sc.acclerate(100);
		
		sc.brake(0);
		
		
		
	}

}
