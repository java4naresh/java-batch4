package test;

import oops.Company;
import oops.Office;

public class CompositionClient {

	public static void main(String[] args) {
		Office office = new Office("IBM", 1, "Hyderabad", "Hyderabad");
        Company company = new Company("IBM", office);
        System.out.println(company.getOffice().officeName);
	}

}
