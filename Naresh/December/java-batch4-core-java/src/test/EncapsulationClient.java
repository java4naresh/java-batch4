package test;

import encapsulation.Customer;

public class EncapsulationClient {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Naresh", 30, 789456123);
		System.out.println(customer.getCustomerName());
        customer.setCustomerName("Naresh Kambala");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.toString());
        
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setCustomerName("Pavan");
		System.out.println(customer2.getCustAge());
		customer2.setCustAge(29);
		System.out.println(customer2.getCustAge());
		
		System.out.println(customer2.toString());
		
	}

}
