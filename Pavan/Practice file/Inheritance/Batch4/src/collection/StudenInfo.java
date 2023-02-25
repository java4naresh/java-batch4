package collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StudenInfo {

	public static void main(String[] args) {

		Map<String, String> students = new HashMap<>();

		try {
			FileReader fr = new FileReader("E:\\Student.txt");
			try (BufferedReader br = new BufferedReader(fr)) {
				{
					String line = br.readLine();
					while (line != null) {
						// System.out.println(line);

						int firstComma = line.indexOf(",");
						String name = line.substring(0, firstComma);
						String semisters = line.substring(firstComma + 1);
						// String[] values = line.split(",");
						// System.out.println(line);
						// System.out.println(values[0]+"-"+values[1]);
						/*
						 * Set<String> keys = students.keySet(); for (String name1 : keys) {
						 * System.out.println(name); }
						 */

						line = br.readLine();
						// Set<String> keys = students.keySet();
						// for(String key : keys) {
						// System.out.println(key);
						// }
						// System.out.println(line);

						// nareshSemister.put("Naresh", students);
						// students.put("Naresh", "Naresh semister1");
						// System.out.println(students);

						// System.out.println(nareshSemister);
						students.put(name, semisters);

					}
					/*
					 * System.out.println(students.get("DhanaLakshmi semister1"));
					 * System.out.println(students.get("DhanaLakshmi semister2"));
					 * System.out.println(students.get("DhanaLakshmi semister3"));
					 * System.out.println(students.get("DhanaLakshmi semister4"));
					 * System.out.println(students.get("DhanaLakshmi semister5"));
					 * System.out.println(students.get("DhanaLakshmi semister6"));
					 * System.out.println(students.get("DhanaLakshmi semister7"));
					 * System.out.println(students.get("DhanaLakshmi semister8"));
					 * 
					 * System.out.println(students.get("Veerababu semister1"));
					 * System.out.println(students.get("Veerababu semister2"));
					 * System.out.println(students.get("Veerababu semister3"));
					 * System.out.println(students.get("Veerababu semister4"));
					 * System.out.println(students.get("Veerababu semister5"));
					 * System.out.println(students.get("Veerababu semister6"));
					 * System.out.println(students.get("Veerababu semister7"));
					 * System.out.println(students.get("Veerababu semister8"));
					 */

					// students.put("Naresh", "Naresh semister1");
					// System.out.println();
					/*
					 * System.out.println(students.get("Naresh semister1"));
					 * System.out.println(students.get("Naresh semister2"));
					 * System.out.println(students.get("Naresh semister3"));
					 * System.out.println(students.get("Naresh semister4"));
					 * System.out.println(students.get("Naresh semister5"));
					 * System.out.println(students.get("Naresh semister6"));
					 * System.out.println(students.get("Naresh semister7"));
					 * System.out.println(students.get("Naresh semister8"));
					 */
					System.out.println(students.get("Vasavi semister1"));
					System.out.println(students.get("Vasavi semister2"));
					System.out.println(students.get("Vasavi semister3"));
					System.out.println(students.get("Vasavi semister4"));
					System.out.println(students.get("Vasavi semister5"));
					System.out.println(students.get("Vasavi semister6"));
					System.out.println(students.get("Vasavi semister7"));
					System.out.println(students.get("Vasavi semister8"));

					/*
					 * System.out.println(students.get("Vamsi semister1"));
					 * System.out.println(students.get("Vamsi semister2"));
					 * System.out.println(students.get("Vamsi semister3"));
					 * System.out.println(students.get("Vamsi semister4"));
					 * System.out.println(students.get("Vamsi semister5"));
					 * System.out.println(students.get("Vamsi semister6"));
					 * System.out.println(students.get("Vamsi semister7"));
					 * System.out.println(students.get("Vamsi semister8"));
					 */

					// nareshSemister.put("Naresh", students.get("Naresh semister1"));

					// System.out.println(students);
					// nareshSemister.put("semister1", students);
					// System.out.println(nareshSemister);
					// System.out.println(nareshSemister);
					// System.out.println(nareshSemister.entrySet());
					// nareshSemister.put("Naresh", "Naresh semister1");
					// System.out.println(nareshSemister);

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
