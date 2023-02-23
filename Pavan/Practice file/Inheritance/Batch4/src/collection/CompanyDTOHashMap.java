package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyDTOHashMap {

	public static void main(String[] args) {

		Map<String, Map<String, CompanyDTO>> industry = new HashMap<>();
		Map<String, CompanyDTO> companies = new HashMap<>();

		EmpDetails emp1 = new EmpDetails(1, "Naresh", "Hyderabad", 75000.00, 'M');
		EmpDetails emp2 = new EmpDetails(2, "Vasavi", "Vizag", 55000.00, 'F');
		EmpDetails emp3 = new EmpDetails(3, "Veerababu", "Guntur", 70000.00, 'M');
		EmpDetails emp4 = new EmpDetails(4, "Vamsi", "Bangalore", 60000.00, 'M');
		EmpDetails emp5 = new EmpDetails(5, "Dhana Lakshmi", "Chennai", 85000.00, 'F');
		EmpDetails emp6 = new EmpDetails(6, "Pavan", "Pune", 45000.00, 'M');
		EmpDetails emp7 = new EmpDetails(7, "Gnana Vikas", "Guntur", 70000.00, 'M');
		EmpDetails emp8 = new EmpDetails(8, "Pardhu", "Bangalore", 65000.00, 'M');
		EmpDetails emp9 = new EmpDetails(9, "Triveni", "Chennai", 85000.00, 'F');
		EmpDetails emp10 = new EmpDetails(10, "Rambabu", "Pune", 67000.00, 'M');
		// EmpDetails emp7 = new EmpDetails(5, "Pavan", "Pune", 45000.00, 'M');

		// List<EmpDetails> employees =
		// Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
		List<EmpDetails> employeesInfosys = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
		List<EmpDetails> employeesAmazon = Arrays.asList(emp7, emp8, emp9, emp10);

		CompanyDTO company1 = new CompanyDTO(1, "Infosys", employeesInfosys);
		CompanyDTO company2 = new CompanyDTO(2, "Amazon", employeesAmazon);
		companies.put("Infosys", company1);
		companies.put("Amazon", company2);

		industry.put("IT", companies);
		// System.out.println(companies.get("Infosys"));
		System.out.println(industry.get("IT"));
		// System.out.println(industry.keySet());
		// System.out.println(industry.values());

	}

}
