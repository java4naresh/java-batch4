package test;

import oops.Car;
import oops.Men;

public class AssociationClient {

	public static void main(String[] args) {
		Car car = new Car("Mahinder", "XUV700", "W8", "White");
		Men men = new Men("Naresh", null);
		System.out.println(men.getCar());
		Men men2 = new Men("Mahesh", car);
		System.out.println(men2.getCar().model);
	}

}
