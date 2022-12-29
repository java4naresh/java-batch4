package client;
import clone.DeepCloneExample;
import clone.Student;

public class DeepStudent {
	public static void main(String[] args) {
		Student stu = new Student("Fathima Vidya Nikethan");
		DeepCloneExample dc = new DeepCloneExample("vasavi", 1543208, stu);
		DeepCloneExample dc2;
		try {
			dc2 = dc.clone();
			System.out.println(dc);
			System.out.println(dc2);
			dc.getStu().setSchoolName("vikas school");
			System.out.println(dc);
			System.out.println(dc2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/*DeepCloneExample dc2 = dc.clone();
		System.out.println(dc);
		System.out.println(dc2);
		dc.getStu().setSchoolName("vikas school");
		System.out.println(dc);
		System.out.println(dc2);*/
		
		
	}

}
