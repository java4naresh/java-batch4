package test;

import encapsulation.Customer;
import object.ObjectClassMethods;
import oops.Office;
import oops.Person;

public class ObjectTest {

	public static void main(String[] args) {
		Office office = new Office("IBM", 1, "Hyderabad", "Hyd");
		ObjectClassMethods.myObject(office);
		Customer c = new Customer();
		ObjectClassMethods.myObject(c);
		//Person p = new Person("Naresh", 'm', null);
		//ObjectClassMethods.myObject(p);
		office = null;
		c = null;
		System.gc();

	}

}
