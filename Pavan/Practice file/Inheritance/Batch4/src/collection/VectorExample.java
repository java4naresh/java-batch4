package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// Vector<String> vector = new Vector<>(5, 5);
		// Vector<String> vector = new Vector<>(5);
		List<String> namesList = new ArrayList<>();
		namesList.add("naresh");
		namesList.add("jhansi");
		namesList.add("pavan");
		namesList.add("triveni");
		namesList.add("pardhu");
		namesList.add("gnana vikas");
		namesList.replaceAll(String::toUpperCase);
		System.out.println(namesList);
		Vector<String> vector = new Vector<>(namesList);
		System.out.println(vector.add("Naresh"));
		vector.add("Pavan");
		vector.add("Vasavi");
		vector.add("Dhanalaxmi");
		System.out.println(vector);
		vector.add(2, "Veerababu");
		System.out.println(vector);
	}

}