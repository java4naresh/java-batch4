package test;

import encapsulation.Customer;

public class ObjectClient {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Naresh", 30, 123456);
		Customer c2 = new Customer(1, "Naresh", 30, 123456);
		
		if(c2.equals(c1)) 
			System.out.println("Same object");
		else 
			System.out.println("Not Same");

	}

}
