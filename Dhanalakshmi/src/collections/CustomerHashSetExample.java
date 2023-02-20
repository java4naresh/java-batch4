package collections;

import java.util.HashSet;
import java.util.Set;

public class CustomerHashSetExample {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Dhana1", "12345", "PAN456", "aadhar1243");
		Customer customer2 = new Customer("Dhana2", "16345", "PAN4556", "aadhar1273");
		Customer customer3 = new Customer("Dhana3", "12045", "PAN4516", "aadhar1213");
		Customer customer4 = new Customer("Dhana4", "12445", "PAN4576", "aadhar1023");
		Customer customer5 = new Customer("Dhana5", "12395", "PAN4560", "aadhar1233");
		Customer customer6  = new Customer("Dhana5", "12395", "PAN4560", "aadhar1233");
		Set<Customer> customers = new HashSet<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		System.out.println(customers);

		
	}
	
}
