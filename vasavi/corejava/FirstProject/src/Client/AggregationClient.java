package client;

import oops.Address;
import oops.Person;

public class AggregationClient {

	public static void main(String[] args) {
		Address address = new Address("RCL", "Brahamam", 522421);
		Person person = new Person("vasavi", 'P', address);
		System.out.println(person.getAddress().address1);
		

	}

}
