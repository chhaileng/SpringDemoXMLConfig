package come.simple.java;

public class Truck implements Vehicle{

	@Override
	public void startEngine(String type) {
		System.out.println(type +" is starting...");
	}

}
