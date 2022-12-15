package client;

import encapsulation.Customer;

public class EncapsulationCient {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"vasavi",23, 22227890);
        System.out.println(customer.getCustomerName());
        customer.setCustomerName("vasavi perumalla");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.toString());
        System.out.println(customer.hashCode());
        
        Customer customer2 = new Customer();
        customer2.setCustomerId(2);
        customer2. setCustomerName("sruthi");
        System.out.println(customer2.getCustoAge());
        customer2.setCustoAge(23);
        System.out.println(customer2.getCustoAge());
        
        Customer customer3 = new Customer();
        customer3.setCustomerId(3);
        customer3. setCustomerName("Rupa");
        System.out.println(customer3.getCustoAge());
        
        System.out.println(customer3);
        System.out.println(customer3.hashCode());
        
	}

	
}
