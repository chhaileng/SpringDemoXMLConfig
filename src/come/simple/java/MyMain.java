package come.simple.java;

public class MyMain {
	
	public static void main(String[] args) {
		
		// 1. Create Object
		Vehicle vehicle1 = new Truck();
		Vehicle vehicle2= new Car();
		
		// 2. Call method 
		vehicle1.startEngine("Truck");
		vehicle2.startEngine("Car");
		
	}

}
