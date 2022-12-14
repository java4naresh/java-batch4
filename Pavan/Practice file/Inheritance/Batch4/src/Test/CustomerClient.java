package Test;

import encapsulation.Customer;

public class CustomerClient {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Pardhu", 3, 456789213, "1234567890");
		System.out.println(customer.getCustomerName());
        customer.setCustomerName("Pardhu Pallapati");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getAadharNumber());
        System.out.println(customer.getCustAge());
        System.out.println(customer.getCustomerId());
        System.out.println(customer.toString());
        System.out.println("-----------------------------------");
        
        Customer customer2 = new Customer(2, "Gnana Vikas", 1, 456714728, "0987654321");
		System.out.println(customer2.getCustomerName());
        customer2.setCustomerName("Gnana Vikas Pallapati");
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getAadharNumber());
        System.out.println(customer2.getCustAge());
        System.out.println(customer2.getCustomerId());
        System.out.println(customer2.toString());
        System.out.println("----------------------------------");
        
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setCustomerName("Pavan");
		customer3.setCustAge(30);
		customer3.setAadharNumber(25836974);
		customer3.setPhoneNumber("0123852741");
		System.out.println(customer3.getCustomerId());
		System.out.println(customer3.getCustomerName());
		System.out.println(customer3.getCustAge());
		System.out.println(customer3.getAadharNumber());
		System.out.println(customer3.getPhoneNumber("0123852741"));
		System.out.println(customer3.toString());
		
	}
}
