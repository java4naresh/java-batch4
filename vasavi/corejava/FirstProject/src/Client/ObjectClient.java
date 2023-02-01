package client;

import encapsulation.Customer;
import object.ObjectClassMethods;
import oops.Office;
import oops.Person;

public class ObjectClient {

	public static void main(String[] args) {
		Office office = new Office("IBM", 1, "Hyderabad", "HYD");
		ObjectClassMethods.myObject(office);
		Customer c = new Customer();
		ObjectClassMethods.myObject(c);
		Person p = new Person("vasavi", 'p', null);
		ObjectClassMethods.myObject(p);
		office = null;
		c= null;
		System.gc();

	}

}