package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStudentHashMap {
	
	public static void main(String[] args) {
		
		Map<JavaStudent, List<String>> opportunites = new HashMap<>();
		JavaStudent student1 = new JavaStudent(1, "Naresh", 'M', "MTech", "Micro Services");
		JavaStudent student2 = new JavaStudent(2, "Pavan", 'M', "BTech", "Spring Boot");
		JavaStudent student3 = new JavaStudent(3, "Vamsi", 'M', "BTech", "Spring");
		JavaStudent student4 = new JavaStudent(4, "Vasavi", 'F', "MCA", "Spring MVC");
		JavaStudent student5 = new JavaStudent(5, "Dhanalaxmi", 'F', "MBA", "Fullstack");
		JavaStudent student6 = new JavaStudent(6, "Veerababu", 'M', "BTech", "Fullstack");
		List<String> microServices = new ArrayList<>();
		microServices.add("Microsoft");
		microServices.add("Google");
		microServices.add("Facebook");
		microServices.add("Twitter");
		microServices.add("Amazon");
		microServices.add("Netflix");
		
		List<String> springBoot = new ArrayList<>();
		springBoot.add("Facebook");
		springBoot.add("Twitter");
		springBoot.add("Amazon");
		springBoot.add("Netflix");
		
		List<String> fullstack = new ArrayList<>();
		fullstack.add("Infosys");
		fullstack.add("TCS");
		fullstack.add("Wipro");
		fullstack.add("IBM");
		opportunites.put(student1, microServices);
		opportunites.put(student2, springBoot);
		opportunites.put(student3, springBoot);
		opportunites.put(student4, springBoot);
		opportunites.put(student5, fullstack);
		opportunites.put(student6, fullstack);
		
		//System.out.println(opportunites);
		
		System.out.println(opportunites.get (new JavaStudent(1, "Naresh", 'M', "MTech", "Micro Services")));
		
		
		
	
	
	
	}
	

}
