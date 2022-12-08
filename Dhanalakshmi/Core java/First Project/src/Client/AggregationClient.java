package Client;

import oops.Address;
import oops.Person;

public class AggregationClient {

	public static void main(String[] args) {
	  Address address = new Address("hyd","kphb",500212,4941287);
      Person person = new Person("Dhana",'F',address);
	  System.out.println(person.getAddress().address1);
	  
	}

}
