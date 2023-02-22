package collection;

import java.util.HashMap;
import java.util.Map;

public class StudentSemisterMarks {

	public static void main(String[] args) {
		/*Map<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("Naresh", 3000);
		studentMarks.put("Vasavi", 3300);
		studentMarks.put("Dhanalaxmi", 3200);
		studentMarks.put("Pavan", 3500);
		studentMarks.put("Veerababu", 3700);
		System.out.println(studentMarks);
		System.out.println(studentMarks.get("Naresh"));
		System.out.println(studentMarks.get("Veerababu"));*/
		
		/*Map<String, Map<String, Integer>> studentMarks = new HashMap<>();
		Map<String, Integer> nareshMarks = new HashMap<>();
		nareshMarks.put("Semister1", 800);
		nareshMarks.put("Semister2", 400);
		nareshMarks.put("Semister3", 600);
		nareshMarks.put("Semister4", 500);
		nareshMarks.put("Semister5", 300);
		nareshMarks.put("Semister6", 200);
		nareshMarks.put("Semister7", 350);
		nareshMarks.put("Semister8", 700);
		studentMarks.put("Naresh", nareshMarks);
		Map<String, Integer> vasaviMarks = new HashMap<>();
		vasaviMarks.put("Semister1", 900);
		vasaviMarks.put("Semister2", 500);
		vasaviMarks.put("Semister3", 600);
		vasaviMarks.put("Semister4", 800);
		vasaviMarks.put("Semister5", 850);
		vasaviMarks.put("Semister6", 300);
		vasaviMarks.put("Semister7", 350);
		vasaviMarks.put("Semister8", 950);
		studentMarks.put("Vasavi", vasaviMarks);
		System.out.println(studentMarks);*/
		
		Map<String, Map<String, Map<String, Integer>>> studentMarks = new HashMap<>();
		Map<String, Map<String, Integer>> nareshSemister = new HashMap<>();
		Map<String, Integer> nareshSemister1SubjectMarks = new HashMap<>();
		nareshSemister1SubjectMarks.put("English", 75);
		nareshSemister1SubjectMarks.put("Physics", 68);
		nareshSemister1SubjectMarks.put("Chemistry", 85);
		nareshSemister1SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister2SubjectMarks = new HashMap<>();
		nareshSemister2SubjectMarks.put("English", 75);
		nareshSemister2SubjectMarks.put("Physics", 68);
		nareshSemister2SubjectMarks.put("Chemistry", 85);
		nareshSemister2SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister3SubjectMarks = new HashMap<>();
		nareshSemister3SubjectMarks.put("English", 75);
		nareshSemister3SubjectMarks.put("Physics", 68);
		nareshSemister3SubjectMarks.put("Chemistry", 85);
		nareshSemister3SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister4SubjectMarks = new HashMap<>();
		nareshSemister4SubjectMarks.put("English", 75);
		nareshSemister4SubjectMarks.put("Physics", 68);
		nareshSemister4SubjectMarks.put("Chemistry", 85);
		nareshSemister4SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister5SubjectMarks = new HashMap<>();
		nareshSemister5SubjectMarks.put("English", 75);
		nareshSemister5SubjectMarks.put("Physics", 68);
		nareshSemister5SubjectMarks.put("Chemistry", 85);
		nareshSemister5SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister6SubjectMarks = new HashMap<>();
		nareshSemister6SubjectMarks.put("English", 75);
		nareshSemister6SubjectMarks.put("Physics", 68);
		nareshSemister6SubjectMarks.put("Chemistry", 85);
		nareshSemister6SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister7SubjectMarks = new HashMap<>();
		nareshSemister7SubjectMarks.put("English", 75);
		nareshSemister7SubjectMarks.put("Physics", 68);
		nareshSemister7SubjectMarks.put("Chemistry", 85);
		nareshSemister7SubjectMarks.put("Drawing", 70);
		Map<String, Integer> nareshSemister8SubjectMarks = new HashMap<>();
		nareshSemister8SubjectMarks.put("English", 75);
		nareshSemister8SubjectMarks.put("Physics", 68);
		nareshSemister8SubjectMarks.put("Chemistry", 85);
		nareshSemister8SubjectMarks.put("Drawing", 70);
		nareshSemister.put("Semister1", nareshSemister1SubjectMarks);
		nareshSemister.put("Semister2", nareshSemister2SubjectMarks);
		nareshSemister.put("Semister3", nareshSemister3SubjectMarks);
		nareshSemister.put("Semister4", nareshSemister4SubjectMarks);
		nareshSemister.put("Semister5", nareshSemister5SubjectMarks);
		nareshSemister.put("Semister6", nareshSemister6SubjectMarks);
		nareshSemister.put("Semister7", nareshSemister7SubjectMarks);
		nareshSemister.put("Semister8", nareshSemister8SubjectMarks);
		
		studentMarks.put("Naresh", nareshSemister);
		System.out.println(studentMarks);
	}

}
