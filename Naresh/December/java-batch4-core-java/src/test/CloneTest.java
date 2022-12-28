package test;

import clone.Employee;
import clone.SwallowCloning;

public class CloneTest {

	public static void main(String[] args) {
		Employee emp = new Employee("IBM");
		SwallowCloning sc = new SwallowCloning("Naresh", 30, emp);
		try {
			SwallowCloning sc2 = sc.clone();
			System.out.println(sc);
			System.out.println(sc2);
			
			//Employee emp2 = sc2.getEmp();
			//emp2.setCompanyName("Amazon");
			sc2.getEmp().setCompanyName("Amazon");
			
			sc2.setName("Naresh Kambala");
			System.out.println(sc);
			System.out.println(sc2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
