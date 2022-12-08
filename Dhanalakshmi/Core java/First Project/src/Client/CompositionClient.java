package Client;

import oops.Company;
import oops.Office;

public class CompositionClient {

	public static void main(String[] args) {
	  Office office = new Office("TCS",1,"HYD","HYD");	
      Company company = new Company("IBM",office);
      System.out.println(company.getOffice().officeName);
      
	}

}
