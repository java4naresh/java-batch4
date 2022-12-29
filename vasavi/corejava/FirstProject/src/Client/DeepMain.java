package client;
import clone.DeepClone;
import clone.Employee;

public class DeepMain {
	
	public static void main(String[] args) {
		Employee emp = new Employee("IBM");
		DeepClone dc = new DeepClone("Vasavi", 23 , emp);	
		DeepClone dc2;
		try {
			dc2 = dc.clone();
			System.out.println(dc);
			System.out.println(dc2);
		    dc.getEmp().setCompanyName("Microsoft");
			System.out.println(dc);
			System.out.println(dc2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		/*DeepClone dc2 = dc.clone();
		System.out.println(dc);
		System.out.println(dc2);
	    dc.getEmp().setCompanyName("Microsoft");
		System.out.println(dc);
		System.out.println(dc2);*/
		
	}

}
