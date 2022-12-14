package client;

public class EncapsulationCient {

	public static void main(String[] args) {
		
			Customer customer = new Customer(1, "vasavi", 23, 7780129270);
			System.out.println(customer.getCustomerName());
	        customer.setCustomerName("vasavi perumalla");
	        System.out.println(customer.getCustomerName());
	        System.out.println(customer.toString());
	        
			Customer customer2 = new Customer();
			customer2.setCustomerId(2);
			customer2.setCustomerName("sruthi");
			System.out.println(customer2.getCustAge());
			customer2.setCustAge(23);
			System.out.println(customer2.getCustAge());
			
			System.out.println(customer2.toString());
			
	}

}
