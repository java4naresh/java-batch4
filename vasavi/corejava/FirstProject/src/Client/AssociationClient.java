package client;

import oops.Car;
import oops.Women;

public class AssociationClient {
	
	public static void main(String[] args) {
		
		Car car = new Car("Mahindra", "XUV700", " w8", "white" );
		Women women = new Women("vasavi", null);
		System.out.println(women.getCar());
		Women women2 = new Women("sruthi", car);
		System.out.println(women2.getCar().model);
		
	}
	
			

}
