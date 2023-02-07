package collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<StudentInfo> student = new ArrayList<>();
		
		StudentInfo student1 = new StudentInfo(10,"Raju",20,76543821,"Nellore",'M');
		StudentInfo student2 = new StudentInfo(2,"Janu",18,65543211," Guntur",'F');
		StudentInfo student3 = new StudentInfo(13,"Hema",17,98765432,"Vizag",'F');
		StudentInfo student4 = new StudentInfo(14,"Ravi",21,45678992,"Nasaraopeta",'M');
		StudentInfo student5 = new StudentInfo(5,"sneha",15,876654467,"Guntur",'F');
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		student.add(student5);
		System.out.println(student);
		
		Collections.sort(student);
		System.out.println(student);
		
		
		
	}

}
