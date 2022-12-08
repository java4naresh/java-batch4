package test;

import oops.Address;
import oops.Person;

public class AggregationClient {

	public static void main(String[] args) {
		Address address = new Address("hyd", "kukatpaly", 500072);
		Person person = new Person("Naresh", 'M', address);
		System.out.println(person.getAddress().address1);
	}

}
