package Client;

import encapsulation.Customer;

public class EncapsulationClient {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Charanya",2,766841329);
        System.out.println(customer.getCustomerName());
        customer.setCustomerName("Charanya Mannem");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.toString());
        
        Customer customer2 = new Customer();
        customer2.setCustomerId(2);
        customer2. setCustomerName("Mahira");
        System.out.println(customer2.getCustoAge());
        customer2.setCustoAge(1);
        System.out.println(customer2.getCustoAge());
        
        Customer customer3 = new Customer();
        customer3.setCustomerId(3);
        customer3. setCustomerName("Dhana");
        System.out.println(customer3.getCustoAge());
        System.out.println(customer3.toString());
        
	}

	
}
