package Client;

import oops.Car;
import oops.Women;

public class AssociationClient {

	public static void main(String[] args) {
		Car car = new Car("BMW","AP2619","D26","Black");
		Women women = new Women("Dhana",null);
		System.out.println(women.getCar());
		Women women2 = new Women("Charanya",car);
		System.out.println(women2.getCar().color);

	}

}
