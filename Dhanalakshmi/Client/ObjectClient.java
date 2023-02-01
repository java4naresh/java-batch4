package Client;

import encapsulation.Customer;

public class ObjectClient {

	public static void main(String[] args) {
		Customer c1 = new Customer(1,"Charanya",2,254689);
		Customer c2 = new Customer(1,"Charanya",2,254689);
		
        if(c1.equals(c2)) 
        	System.out.println("Same object");
        else
        	System.out.println("Not Same");
	}

}
