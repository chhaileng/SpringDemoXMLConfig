package come.simple.java;

public class Car implements Vehicle{

	@Override
	public void startEngine(String type) {
		System.out.println(type +" is starting...");
	}

}
