package collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeesArrayList {

	public static void main(String[] args) {
		ArrayList<EmployeesInfo> employees = new ArrayList<>();
		EmployeesInfo employees1 = new EmployeesInfo("Charanya", 101, 3, 989554, 'F');
		EmployeesInfo employees2 = new EmployeesInfo("Mahira", 102, 2, 582645, 'F');
		EmployeesInfo employees3 = new EmployeesInfo("Divishad", 103, 16, 987456, 'M');
		EmployeesInfo employees4 = new EmployeesInfo("Varsha", 104, 18, 366545, 'F');
		EmployeesInfo employees5 = new EmployeesInfo("Ashok", 105, 22, 22587488, 'M');
		employees.add(employees1);
		employees.add(employees2);
		employees.add(employees3);	
		employees.add(employees4);
		employees.add(employees5);
		System.out.println(employees);
		
		employees.remove(new EmployeesInfo("Charanya", 101, 3, 989554, 'F'));
		ArrayList<EmployeesInfo> employees21 = new ArrayList<>();
		employees21.add(new EmployeesInfo("Charanya", 101, 3, 989554, 'F'));
		employees.removeAll(employees21);
		
		Collections.sort(employees);
		System.out.println(employees);

	}

}
