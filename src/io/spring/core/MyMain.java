package io.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
	
	public static void main(String[] args) {
		
//		// 1. Create Object
//		Vehicle vehicle1 = new Truck();
//		Vehicle vehicle2= new Car();
//		
//		// 2. Call method 
//		vehicle1.startEngine("Truck");
//		vehicle2.startEngine("Car");
		
		// 1. Add Spring Library
		// 2. Create XML file -> Create Bean
		// 3. Load Spring Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 4. Get Bean
		Vehicle car = (Car) context.getBean("car");
		Vehicle truck = context.getBean("truck" , Truck.class);
		
		// 5. Call method
		car.startEngine("car");
		
		truck.startEngine("truck");
		
		// 6. close context
		context.close();
		
		
		
	}

}
