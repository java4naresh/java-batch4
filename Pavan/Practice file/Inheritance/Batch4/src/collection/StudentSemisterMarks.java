package collection;

import java.util.HashMap;
import java.util.Map;

public class StudentSemisterMarks {
	public static void main(String[] args) {
		/*
		 * Map<String, Integer> studentMarks = new HashMap<>();
		 * studentMarks.put("Naresh", 3000); studentMarks.put("Vasavi", 3300);
		 * studentMarks.put("Dhanalaxmi", 3200); studentMarks.put("Pavan", 3500);
		 * studentMarks.put("Veerababu", 3700); System.out.println(studentMarks);
		 * System.out.println(studentMarks.get("Naresh"));
		 * System.out.println(studentMarks.get("Veerababu"));
		 */

		/*
		 * Map<String, Map<String, Integer>> studentMarks = new HashMap<>(); Map<String,
		 * Integer> nareshMarks = new HashMap<>(); nareshMarks.put("Semister1", 800);
		 * nareshMarks.put("Semister2", 400); nareshMarks.put("Semister3", 600);
		 * nareshMarks.put("Semister4", 500); nareshMarks.put("Semister5", 300);
		 * nareshMarks.put("Semister6", 200); nareshMarks.put("Semister7", 350);
		 * nareshMarks.put("Semister8", 700); studentMarks.put("Naresh", nareshMarks);
		 * Map<String, Integer> vasaviMarks = new HashMap<>();
		 * vasaviMarks.put("Semister1", 900); vasaviMarks.put("Semister2", 500);
		 * vasaviMarks.put("Semister3", 600); vasaviMarks.put("Semister4", 800);
		 * vasaviMarks.put("Semister5", 850); vasaviMarks.put("Semister6", 300);
		 * vasaviMarks.put("Semister7", 350); vasaviMarks.put("Semister8", 950);
		 * studentMarks.put("Vasavi", vasaviMarks); System.out.println(studentMarks);
		 */

		Map<String, Map<String, Map<String, Integer>>> studentMarks = new HashMap<>();
		Map<String, Map<String, Integer>> nareshSemister = new HashMap<>();
		Map<String, Map<String, Integer>> vasaviSemister = new HashMap<>();
		Map<String, Map<String, Integer>> dhanaLakshmiSemister = new HashMap<>();
		Map<String, Map<String, Integer>> veerababuSemister = new HashMap<>();
		Map<String, Map<String, Integer>> vamsiSemister = new HashMap<>();
		Map<String, Map<String, Integer>> pavanSemister = new HashMap<>();

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

		Map<String, Integer> pavanSemister1SubjectMarks = new HashMap<>();
		pavanSemister1SubjectMarks.put("English", 55);
		pavanSemister1SubjectMarks.put("Physics", 50);
		pavanSemister1SubjectMarks.put("Chemistry", 40);
		pavanSemister1SubjectMarks.put("Drawing", 45);
		Map<String, Integer> pavanSemister2SubjectMarks = new HashMap<>();
		pavanSemister2SubjectMarks.put("English", 60);
		pavanSemister2SubjectMarks.put("Physics", 55);
		pavanSemister2SubjectMarks.put("Chemistry", 45);
		pavanSemister2SubjectMarks.put("Drawing", 50);
		Map<String, Integer> pavanSemister3SubjectMarks = new HashMap<>();
		pavanSemister3SubjectMarks.put("English", 65);
		pavanSemister3SubjectMarks.put("Physics", 60);
		pavanSemister3SubjectMarks.put("Chemistry", 50);
		pavanSemister3SubjectMarks.put("Drawing", 55);
		Map<String, Integer> pavanSemister4SubjectMarks = new HashMap<>();
		pavanSemister4SubjectMarks.put("English", 70);
		pavanSemister4SubjectMarks.put("Physics", 65);
		pavanSemister4SubjectMarks.put("Chemistry", 55);
		pavanSemister4SubjectMarks.put("Drawing", 60);
		Map<String, Integer> pavanSemister5SubjectMarks = new HashMap<>();
		pavanSemister5SubjectMarks.put("English", 75);
		pavanSemister5SubjectMarks.put("Physics", 70);
		pavanSemister5SubjectMarks.put("Chemistry", 60);
		pavanSemister5SubjectMarks.put("Drawing", 65);
		Map<String, Integer> pavanSemister6SubjectMarks = new HashMap<>();
		pavanSemister6SubjectMarks.put("English", 80);
		pavanSemister6SubjectMarks.put("Physics", 75);
		pavanSemister6SubjectMarks.put("Chemistry", 65);
		pavanSemister6SubjectMarks.put("Drawing", 70);
		Map<String, Integer> pavanSemister7SubjectMarks = new HashMap<>();
		pavanSemister7SubjectMarks.put("English", 85);
		pavanSemister7SubjectMarks.put("Physics", 80);
		pavanSemister7SubjectMarks.put("Chemistry", 70);
		pavanSemister7SubjectMarks.put("Drawing", 75);
		Map<String, Integer> pavanSemister8SubjectMarks = new HashMap<>();
		pavanSemister8SubjectMarks.put("English", 90);
		pavanSemister8SubjectMarks.put("Physics", 85);
		pavanSemister8SubjectMarks.put("Chemistry", 75);
		pavanSemister8SubjectMarks.put("Drawing", 80);
		pavanSemister.put("Semister1", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister2", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister3", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister4", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister5", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister6", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister7", pavanSemister1SubjectMarks);
		pavanSemister.put("Semister8", pavanSemister1SubjectMarks);

		Map<String, Integer> vasaviSemister1SubjectMarks = new HashMap<>();
		vasaviSemister1SubjectMarks.put("English", 80);
		vasaviSemister1SubjectMarks.put("Physics", 65);
		vasaviSemister1SubjectMarks.put("Chemistry", 82);
		vasaviSemister1SubjectMarks.put("Drawing", 75);
		Map<String, Integer> vasaviSemister2SubjectMarks = new HashMap<>();
		vasaviSemister2SubjectMarks.put("English", 85);
		vasaviSemister2SubjectMarks.put("Physics", 68);
		vasaviSemister2SubjectMarks.put("Chemistry", 85);
		vasaviSemister2SubjectMarks.put("Drawing", 77);
		Map<String, Integer> vasaviSemister3SubjectMarks = new HashMap<>();
		vasaviSemister3SubjectMarks.put("English", 87);
		vasaviSemister3SubjectMarks.put("Physics", 73);
		vasaviSemister3SubjectMarks.put("Chemistry", 87);
		vasaviSemister3SubjectMarks.put("Drawing", 79);
		Map<String, Integer> vasaviSemister4SubjectMarks = new HashMap<>();
		vasaviSemister4SubjectMarks.put("English", 90);
		vasaviSemister4SubjectMarks.put("Physics", 75);
		vasaviSemister4SubjectMarks.put("Chemistry", 89);
		vasaviSemister4SubjectMarks.put("Drawing", 85);
		Map<String, Integer> vasaviSemister5SubjectMarks = new HashMap<>();
		vasaviSemister5SubjectMarks.put("English", 92);
		vasaviSemister5SubjectMarks.put("Physics", 78);
		vasaviSemister5SubjectMarks.put("Chemistry", 90);
		vasaviSemister5SubjectMarks.put("Drawing", 87);
		Map<String, Integer> vasaviSemister6SubjectMarks = new HashMap<>();
		vasaviSemister6SubjectMarks.put("English", 85);
		vasaviSemister6SubjectMarks.put("Physics", 75);
		vasaviSemister6SubjectMarks.put("Chemistry", 80);
		vasaviSemister6SubjectMarks.put("Drawing", 75);
		Map<String, Integer> vasaviSemister7SubjectMarks = new HashMap<>();
		vasaviSemister7SubjectMarks.put("English", 75);
		vasaviSemister7SubjectMarks.put("Physics", 68);
		vasaviSemister7SubjectMarks.put("Chemistry", 85);
		vasaviSemister7SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vasaviSemister8SubjectMarks = new HashMap<>();
		vasaviSemister8SubjectMarks.put("English", 77);
		vasaviSemister8SubjectMarks.put("Physics", 74);
		vasaviSemister8SubjectMarks.put("Chemistry", 55);
		vasaviSemister8SubjectMarks.put("Drawing", 80);
		vasaviSemister.put("Semister1", vasaviSemister1SubjectMarks);
		vasaviSemister.put("Semister2", vasaviSemister2SubjectMarks);
		vasaviSemister.put("Semister3", vasaviSemister3SubjectMarks);
		vasaviSemister.put("Semister4", vasaviSemister4SubjectMarks);
		vasaviSemister.put("Semister5", vasaviSemister5SubjectMarks);
		vasaviSemister.put("Semister6", vasaviSemister6SubjectMarks);
		vasaviSemister.put("Semister7", vasaviSemister7SubjectMarks);
		vasaviSemister.put("Semister8", vasaviSemister8SubjectMarks);

		Map<String, Integer> dhanaLakshmiSemister1SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister1SubjectMarks.put("English", 80);
		dhanaLakshmiSemister1SubjectMarks.put("Physics", 65);
		dhanaLakshmiSemister1SubjectMarks.put("Chemistry", 82);
		dhanaLakshmiSemister1SubjectMarks.put("Drawing", 75);
		Map<String, Integer> dhanaLakshmiSemister2SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister2SubjectMarks.put("English", 85);
		dhanaLakshmiSemister2SubjectMarks.put("Physics", 68);
		dhanaLakshmiSemister2SubjectMarks.put("Chemistry", 85);
		dhanaLakshmiSemister2SubjectMarks.put("Drawing", 77);
		Map<String, Integer> dhanaLakshmiSemister3SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister3SubjectMarks.put("English", 87);
		dhanaLakshmiSemister3SubjectMarks.put("Physics", 73);
		dhanaLakshmiSemister3SubjectMarks.put("Chemistry", 87);
		dhanaLakshmiSemister3SubjectMarks.put("Drawing", 79);
		Map<String, Integer> dhanaLakshmiSemister4SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister4SubjectMarks.put("English", 90);
		dhanaLakshmiSemister4SubjectMarks.put("Physics", 75);
		dhanaLakshmiSemister4SubjectMarks.put("Chemistry", 89);
		dhanaLakshmiSemister4SubjectMarks.put("Drawing", 85);
		Map<String, Integer> dhanaLakshmiSemister5SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister5SubjectMarks.put("English", 92);
		dhanaLakshmiSemister5SubjectMarks.put("Physics", 78);
		dhanaLakshmiSemister5SubjectMarks.put("Chemistry", 90);
		dhanaLakshmiSemister5SubjectMarks.put("Drawing", 87);
		Map<String, Integer> dhanaLakshmiSemister6SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister6SubjectMarks.put("English", 85);
		dhanaLakshmiSemister6SubjectMarks.put("Physics", 75);
		dhanaLakshmiSemister6SubjectMarks.put("Chemistry", 80);
		dhanaLakshmiSemister6SubjectMarks.put("Drawing", 75);
		Map<String, Integer> dhanaLakshmiSemister7SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister7SubjectMarks.put("English", 75);
		dhanaLakshmiSemister7SubjectMarks.put("Physics", 68);
		dhanaLakshmiSemister7SubjectMarks.put("Chemistry", 85);
		dhanaLakshmiSemister7SubjectMarks.put("Drawing", 70);
		Map<String, Integer> dhanaLakshmiSemister8SubjectMarks = new HashMap<>();
		dhanaLakshmiSemister8SubjectMarks.put("English", 77);
		dhanaLakshmiSemister8SubjectMarks.put("Physics", 74);
		dhanaLakshmiSemister8SubjectMarks.put("Chemistry", 55);
		dhanaLakshmiSemister8SubjectMarks.put("Drawing", 80);
		dhanaLakshmiSemister.put("Semister1", dhanaLakshmiSemister1SubjectMarks);
		dhanaLakshmiSemister.put("Semister2", dhanaLakshmiSemister2SubjectMarks);
		dhanaLakshmiSemister.put("Semister3", dhanaLakshmiSemister3SubjectMarks);
		dhanaLakshmiSemister.put("Semister4", dhanaLakshmiSemister4SubjectMarks);
		dhanaLakshmiSemister.put("Semister5", dhanaLakshmiSemister5SubjectMarks);
		dhanaLakshmiSemister.put("Semister6", dhanaLakshmiSemister6SubjectMarks);
		dhanaLakshmiSemister.put("Semister7", dhanaLakshmiSemister7SubjectMarks);
		dhanaLakshmiSemister.put("Semister8", dhanaLakshmiSemister8SubjectMarks);

		Map<String, Integer> veerababuSemister1SubjectMarks = new HashMap<>();
		veerababuSemister1SubjectMarks.put("English", 55);
		veerababuSemister1SubjectMarks.put("Physics", 50);
		veerababuSemister1SubjectMarks.put("Chemistry", 40);
		veerababuSemister1SubjectMarks.put("Drawing", 45);
		Map<String, Integer> veerababuSemister2SubjectMarks = new HashMap<>();
		veerababuSemister2SubjectMarks.put("English", 60);
		veerababuSemister2SubjectMarks.put("Physics", 55);
		veerababuSemister2SubjectMarks.put("Chemistry", 45);
		veerababuSemister2SubjectMarks.put("Drawing", 50);
		Map<String, Integer> veerababuSemister3SubjectMarks = new HashMap<>();
		veerababuSemister3SubjectMarks.put("English", 65);
		veerababuSemister3SubjectMarks.put("Physics", 60);
		veerababuSemister3SubjectMarks.put("Chemistry", 50);
		veerababuSemister3SubjectMarks.put("Drawing", 55);
		Map<String, Integer> veerababuSemister4SubjectMarks = new HashMap<>();
		veerababuSemister4SubjectMarks.put("English", 70);
		veerababuSemister4SubjectMarks.put("Physics", 65);
		veerababuSemister4SubjectMarks.put("Chemistry", 55);
		veerababuSemister4SubjectMarks.put("Drawing", 60);
		Map<String, Integer> veerababuSemister5SubjectMarks = new HashMap<>();
		veerababuSemister5SubjectMarks.put("English", 75);
		veerababuSemister5SubjectMarks.put("Physics", 70);
		veerababuSemister5SubjectMarks.put("Chemistry", 60);
		veerababuSemister5SubjectMarks.put("Drawing", 65);
		Map<String, Integer> veerababuSemister6SubjectMarks = new HashMap<>();
		veerababuSemister6SubjectMarks.put("English", 80);
		veerababuSemister6SubjectMarks.put("Physics", 75);
		veerababuSemister6SubjectMarks.put("Chemistry", 65);
		veerababuSemister6SubjectMarks.put("Drawing", 70);
		Map<String, Integer> veerababuSemister7SubjectMarks = new HashMap<>();
		veerababuSemister7SubjectMarks.put("English", 85);
		veerababuSemister7SubjectMarks.put("Physics", 80);
		veerababuSemister7SubjectMarks.put("Chemistry", 70);
		veerababuSemister7SubjectMarks.put("Drawing", 75);
		Map<String, Integer> veerababuSemister8SubjectMarks = new HashMap<>();
		veerababuSemister8SubjectMarks.put("English", 90);
		veerababuSemister8SubjectMarks.put("Physics", 85);
		veerababuSemister8SubjectMarks.put("Chemistry", 75);
		veerababuSemister8SubjectMarks.put("Drawing", 80);
		veerababuSemister.put("Semister1", veerababuSemister1SubjectMarks);
		veerababuSemister.put("Semister2", veerababuSemister2SubjectMarks);
		veerababuSemister.put("Semister3", veerababuSemister3SubjectMarks);
		veerababuSemister.put("Semister4", veerababuSemister4SubjectMarks);
		veerababuSemister.put("Semister5", veerababuSemister5SubjectMarks);
		veerababuSemister.put("Semister6", veerababuSemister6SubjectMarks);
		veerababuSemister.put("Semister7", veerababuSemister7SubjectMarks);
		veerababuSemister.put("Semister8", veerababuSemister8SubjectMarks);

		Map<String, Integer> vamsiSemister1SubjectMarks = new HashMap<>();
		vamsiSemister1SubjectMarks.put("English", 75);
		vamsiSemister1SubjectMarks.put("Physics", 68);
		vamsiSemister1SubjectMarks.put("Chemistry", 85);
		vamsiSemister1SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister2SubjectMarks = new HashMap<>();
		vamsiSemister2SubjectMarks.put("English", 75);
		vamsiSemister2SubjectMarks.put("Physics", 68);
		vamsiSemister2SubjectMarks.put("Chemistry", 85);
		vamsiSemister2SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister3SubjectMarks = new HashMap<>();
		vamsiSemister3SubjectMarks.put("English", 75);
		vamsiSemister3SubjectMarks.put("Physics", 68);
		vamsiSemister3SubjectMarks.put("Chemistry", 85);
		vamsiSemister3SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister4SubjectMarks = new HashMap<>();
		vamsiSemister4SubjectMarks.put("English", 75);
		vamsiSemister4SubjectMarks.put("Physics", 68);
		vamsiSemister4SubjectMarks.put("Chemistry", 85);
		vamsiSemister4SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister5SubjectMarks = new HashMap<>();
		vamsiSemister5SubjectMarks.put("English", 75);
		vamsiSemister5SubjectMarks.put("Physics", 68);
		vamsiSemister5SubjectMarks.put("Chemistry", 85);
		vamsiSemister5SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister6SubjectMarks = new HashMap<>();
		vamsiSemister6SubjectMarks.put("English", 75);
		vamsiSemister6SubjectMarks.put("Physics", 68);
		vamsiSemister6SubjectMarks.put("Chemistry", 85);
		vamsiSemister6SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister7SubjectMarks = new HashMap<>();
		vamsiSemister7SubjectMarks.put("English", 75);
		vamsiSemister7SubjectMarks.put("Physics", 68);
		vamsiSemister7SubjectMarks.put("Chemistry", 85);
		vamsiSemister7SubjectMarks.put("Drawing", 70);
		Map<String, Integer> vamsiSemister8SubjectMarks = new HashMap<>();
		vamsiSemister8SubjectMarks.put("English", 75);
		vamsiSemister8SubjectMarks.put("Physics", 68);
		vamsiSemister8SubjectMarks.put("Chemistry", 85);
		vamsiSemister8SubjectMarks.put("Drawing", 70);
		vamsiSemister.put("Semister1", vamsiSemister1SubjectMarks);
		vamsiSemister.put("Semister2", vamsiSemister2SubjectMarks);
		vamsiSemister.put("Semister3", vamsiSemister3SubjectMarks);
		vamsiSemister.put("Semister4", vamsiSemister4SubjectMarks);
		vamsiSemister.put("Semister5", vamsiSemister5SubjectMarks);
		vamsiSemister.put("Semister6", vamsiSemister6SubjectMarks);
		vamsiSemister.put("Semister7", vamsiSemister7SubjectMarks);
		vamsiSemister.put("Semister8", vamsiSemister8SubjectMarks);

		studentMarks.put("Naresh", nareshSemister);
		studentMarks.put("Dhana Lakshmi", vasaviSemister);
		studentMarks.put("Pavan", pavanSemister);
		studentMarks.put("Veerababu", veerababuSemister);
		studentMarks.put("Vamsi", vamsiSemister);

		//System.out.println(studentMarks);
		 System.out.println(studentMarks.get("Pavan"));
		// System.out.println(studentMarks.get("Naresh"));
		// System.out.println(studentMarks.get("Vasavi"));
		// System.out.println(studentMarks.get("Dhana Lakshmi"));
		// System.out.println(studentMarks.get("Dhana Lakshmi"));
		// System.out.println(studentMarks.get("Veerababu"));
		//System.out.println(studentMarks.get("Vamsi"));
		// System.out.println(studentMarks.containsValue(pavanSemister));//True/False
		// System.out.println(studentMarks.containsKey(pavanSemister));
		// System.out.println(studentMarks.equals(pavanSemister));
		// System.out.println(studentMarks.remove("Pavan", pavanSemister));//Remove method by using key and value
		// System.out.println(studentMarks.size());// size of student marks
		 //System.out.println(studentMarks.toString());
		System.out.println(studentMarks.keySet()); // return total keys

	}

}
