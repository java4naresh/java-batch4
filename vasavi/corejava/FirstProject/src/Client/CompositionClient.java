package client;

import oops.Company;
import oops.Office;

public class CompositionClient {

	public static void main(String[] args) {
		Office office = new Office ("TCS", 1, "Hyderabad", "Hyderabad");
		Company company = new Company("TCS", office);
		System.out.println(company.getOffice().officeName);

	}

}
