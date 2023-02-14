package collections;

import java.util.HashSet;
import java.util.Set;

public class CustomerHashSetExample {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer("Vasavi", "12345","PAN123","aadhar123");
		Customer customer2 = new Customer("Vasavi1", "22345","PAN223","aadhar323");
		Customer customer3 = new Customer("Vasavi2", "32345","PAN323","aadhar223");
		Customer customer4 = new Customer("Vasavi4", "42345","PAN423","aadhar523");
		Customer customer5 = new Customer("Vasavi3", "52345","PAN523","aadhar423");
		Customer customer6 = new Customer("Vasavi3", "52345","PAN523","aadhar423");
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
