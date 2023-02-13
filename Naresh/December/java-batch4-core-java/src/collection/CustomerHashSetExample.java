package collection;

import java.util.HashSet;
import java.util.Set;

public class CustomerHashSetExample {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Ganesh1", "12345", "PAN123", "aadhar123");
		Customer customer2 = new Customer("Ganesh2", "22345", "PAN223", "aadhar223");
		Customer customer3 = new Customer("Ganesh3", "32345", "PAN323", "aadhar323");
		Customer customer4 = new Customer("Ganesh4", "42345", "PAN423", "aadhar423");
		Customer customer5 = new Customer("Ganesh5", "52345", "PAN523", "aadhar523");
		Customer customer6 = new Customer("Ganesh5", "52345", "PAN523", "aadhar523");
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
