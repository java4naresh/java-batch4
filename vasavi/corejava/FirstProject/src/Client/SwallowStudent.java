package client;

import clone.SwallowCloningExample;
import clone.Student;
public class SwallowStudent {

	public static void main(String[] args) {
		Student stu = new Student("Fathima vidya nikethan");
		SwallowCloningExample s1 = new SwallowCloningExample("vasavi", 15143208, stu);
		try {
			   SwallowCloningExample s2 = s1.clone();
			   SwallowCloningExample s3 = s2.clone();
			   System.out.println(s1);
			   System.out.println(s2);
			   System.out.println(s3);
			   s2.getStu().setSchoolName("vikas school");
			   System.out.println(s1);
			   System.out.println(s2);
			   System.out.println(s3);
		   } catch(CloneNotSupportedException e) {
			   e.printStackTrace();
		   }
		

	}

}
