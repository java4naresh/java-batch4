package collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		Employee emp1 = new Employee(1, "Naresh", 'M', 30, 25946, "Hyd");
		Employee emp2 = new Employee(2, "Pavan", 'M', 29, 142575, "Piduguralla");
		Employee emp3 = new Employee(3, "Veerababu", 'M', 27, 142575, "Sattenapalli");
		Employee emp4 = new Employee(4, "Vamsi", 'M', 27, 24157, "Nalgonda");
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp1);
		System.out.println(employees);
		employees.remove(new Employee(1, "Naresh", 'M', 30, 25946, "Hyd"));
		Collections.sort(employees);
		System.out.println(employees);
		employees.removeAll(employees);
		ArrayList<Employee> employees2 = new ArrayList<>();
		employees2.add(new Employee(1, "Vasavi", 'F', 24, 24154, "Vizag"));
		employees2.add(new Employee(2, "Dhana Lakshmi", 'F', 24, 25755, "Kadapa"));
		System.out.println(employees2);

	}

}
