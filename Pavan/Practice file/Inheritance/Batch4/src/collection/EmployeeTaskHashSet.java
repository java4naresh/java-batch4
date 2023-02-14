package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeTaskHashSet {

	public static void main(String[] args) {
		EmployeeTask employee1 = new EmployeeTask(1, "Naresh", 70000, "IT", 'M');
		EmployeeTask employee2 = new EmployeeTask(2, "Jhansi", 50000, "IT", 'F');
		EmployeeTask employee3 = new EmployeeTask(3, "Veerababu", 75000, "HR", 'M');
		EmployeeTask employee4 = new EmployeeTask(4, "Nagalakshmi", 100000, "QA", 'F');
		EmployeeTask employee5 = new EmployeeTask(5, "Vasavi", 30000, ".NET", 'F');
		EmployeeTask employee6 = new EmployeeTask(6, "Dhana Lakshmi", 80000, "HR", 'F');
		EmployeeTask employee7 = new EmployeeTask(7, "Vamsi", 45000, "Devops", 'M');
		EmployeeTask employee8 = new EmployeeTask(8, "Nagesh", 105000, "IT", 'M');
		EmployeeTask employee9 = new EmployeeTask(9, "Pavan", 35000, "IT", 'M');
		EmployeeTask employee10 = new EmployeeTask(10, "Gnana Vikas", 60000, "IT", 'M');
		Set<EmployeeTask> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);
		employees.add(employee8);
		employees.add(employee9);
		employees.add(employee10);
		// employees.add(employee1);
		System.out.println(employees);
		System.out.println("--------------------------");
		Iterator<EmployeeTask> itr = employees.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			EmployeeTask emp = itr.next();
			if (emp.getEmployeeSalary() < 70000) {
				System.out.println(emp);
				System.out.println(emp.getEmployeeSalary());

			} /*
				 * else if (emp.getEmployeeGender() != 'F') { // System.out.println(emp); //
				 * System.out.println(emp.getEmployeeSalary()); } else if
				 * (emp.getEmployeeDepartment() != "HR") { System.out.println(emp);
				 * 
				 * }
				 */
		}

	}

}
