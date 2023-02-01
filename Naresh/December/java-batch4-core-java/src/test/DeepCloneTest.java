package test;

import clone.DeepCloning;
import clone.Employee;

public class DeepCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("IBM");
		//Employee emp2 = new Employee("Infosys");
		DeepCloning dc = new DeepCloning("Naresh", 30, emp);
		//DeepCloning dc3 = new DeepCloning("Naresh", 30, emp2);
		DeepCloning dc2 = dc.clone();
		//DeepCloning dc4 = dc3.clone();
		System.out.println(dc);
		System.out.println(dc2);
		//dc2.getEmp().setCompanyName("Amazon");
		dc.getEmp().setCompanyName("Microsoft");
		System.out.println(dc);
		System.out.println(dc2);

	}

}
