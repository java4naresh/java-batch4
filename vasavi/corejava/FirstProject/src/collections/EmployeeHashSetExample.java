package collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeHashSetExample {
	
	public static void main(String[] args) {
	
		Employee employee1 = new Employee(1,"Naresh",200000,"IT",'M');
		Employee employee2 = new Employee(2,"Pavan",150000,"IT",'M');
		Employee employee3 = new Employee(3,"Dhanalakhmi",100000,"IT",'F');
		Employee employee4 = new Employee(4,"Vasavi",50000,"IT",'F');
		Employee employee5 = new Employee(5,"Vamsi",120000,"IT",'M');
		Employee employee6 = new Employee(6,"Raju",70000,"IT",'M');
		
		Set<Employee> employees = new HashSet<>();
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		//System.out.println(employees);
		
		Set<Employee> employ = empOfHashSet(employees);
		 System.out.println(employ);
		
		
	}
		
	public static Set<Employee> empOfHashSet(Set<Employee> employees) {
		  Set<Employee> salary = new HashSet<>();
		  Iterator<Employee> iterator = employees.iterator();
		  while (iterator.hasNext()) {
		    Employee employ = iterator.next();
		    if (employ.getEmpSalary() > 100000) {
		    // System.out.println(employ);
		      salary.add(employ);
		    }
		  }
		  return salary;
		}
				
}
