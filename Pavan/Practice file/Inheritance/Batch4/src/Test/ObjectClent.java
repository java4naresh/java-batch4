package Test;

import encapsulation.Customer;

public class ObjectClent {

	public static void main(String[] args) {
		Customer c = new Customer(1, "Pardhu", 3, 456789213, "1234567890");
		Customer c1 = new Customer(1, "Pardhu", 3, 456789213, "1234567890");
		if(c.equals(c1))
			System.out.println("Same Object");
		else 
			System.out.println("Not Same Object");

	}

}
