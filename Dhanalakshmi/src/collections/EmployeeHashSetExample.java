package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeHashSetExample {

	public static void main(String[] args) {
	Employee employee1 = new Employee(101, "Dhanu", 150000, "IT", 'F');
	Employee employee2 = new Employee(102, "Charry", 50000, "Banking", 'F');
	Employee employee3 = new Employee(103, "Mahira", 40000, "IT", 'F');
	Employee employee4 = new Employee(104, "Varsha", 55000, "Manager", 'F');
	Employee employee5 = new Employee(105, "Naresh", 350000, "IT", 'M');
	Employee employee6 = new Employee(106, "Pavan", 60000, "IT", 'M');
	Employee employee7 = new Employee(107, "Vasavi", 80000, "IT", 'F');
	Employee employee8 = new Employee(108, "Vamsi", 50000, "TL", 'M');
	Employee employee9 = new Employee(109, "Divishad", 30000, "MD", 'M');
	Employee employee10 = new Employee(110, "Gopi", 250000, "IT", 'M');
	Set<Employee> employees = new HashSet<>();
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

	//System.out.println(employees);
	
	Set<Employee> employee = empOfHashSet(employees);
	 System.out.println(employee);
	
}
	
    public static Set<Employee> empOfHashSet(Set<Employee> employees) {
	  Set<Employee> salary = new HashSet<>();
	  Iterator<Employee> iterator = employees.iterator();
	  while (iterator.hasNext()) {
	    Employee employee = iterator.next();
	    if (employee.getEmpSalary() > 100000) {
	    // System.out.println(employee);
	      salary.add(employee);
	    }
	  }
	  return salary;
	}

}
