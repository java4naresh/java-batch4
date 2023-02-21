package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparator {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Naresh", 'M', 30, 25946, "Hyd", 10);
		Employee emp2 = new Employee(2, "Pavan", 'M', 29, 142575, "Piduguralla", 6);
		Employee emp3 = new Employee(3, "Veerababu", 'M', 27, 142575, "Sattenapalli", 8);
		Employee emp4 = new Employee(4, "Vamsi", 'M', 27, 24157, "Nalgonda", 9);
		Employee emp5 = new Employee(5, "Dhana Lakshmi", 'F', 20, 2145, "Vizag", 8);
		Employee emp6 = new Employee(6, "Vasavi", 'F', 21, 2575, "Vizag", 8);
		Employee emp7 = new Employee(7, "Gnana Vikas", 'M', 1, 1475, "Atchampet", 9);
		Employee emp8 = new Employee(8, "Pardhu", 'M', 3, 204157, "Nandigama", 9);

		List<Employee> emp = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
		// Collections.sort(emp, new EmployeeRatingSorting());
		// Collections.sort(emp, new EmployeeIdSorting());
		// Collections.sort(emp, new EmployeeGenderSorting());
		// emp.sort(new EmployeeRatingSorting());
		// emp.sort(new EmployeeIdSorting());
		emp.sort(new EmployeeGenderSorting());

		System.out.println(emp);
	}

}
