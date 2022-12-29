package client;

import clone.Employee;
 import clone.SwallowCloning;

public class CloneTest {
   public static void main(String[] args) {
	   Employee emp = new Employee("IBM");
	   SwallowCloning sc = new SwallowCloning ("vasavi", 23, emp);
	   try {
		   SwallowCloning sc2 = sc.clone();
		   System.out.println(sc);
		   System.out.println(sc2);
		   sc2.getEmp().setCompanyName("Amazon");
		   System.out.println(sc);
		   System.out.println(sc2);
	   } catch(CloneNotSupportedException e) {
		   e.printStackTrace();
	   }
   
   }

}
