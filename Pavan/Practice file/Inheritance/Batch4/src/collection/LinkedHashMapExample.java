package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> liknedHashMap = new LinkedHashMap<>();
		liknedHashMap.put("January", 31);
		liknedHashMap.put("February", 28);
		liknedHashMap.put("March", 31);
		liknedHashMap.put("April", 30);
		liknedHashMap.put("May", 31);
		liknedHashMap.put("June", 30);
		liknedHashMap.put("July", 31);
		liknedHashMap.put("August", 31);
		liknedHashMap.put("September", 30);
		liknedHashMap.put("October", 31);
		liknedHashMap.put("Novemeber", 30);
		liknedHashMap.put("December", 31);
		liknedHashMap.put("January", 31);
		System.out.println(liknedHashMap);
		// Map<String, Integer> sortedLiknedHashMap = new TreeMap<>(liknedHashMap);
		// System.out.println(sortedLiknedHashMap);
		TreeSet<String> keys = new TreeSet<>(liknedHashMap.keySet());
		System.out.println(keys);
		Map<String, Integer> sortedLiknedHashMap = new TreeMap<>(liknedHashMap);
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			sortedLiknedHashMap.put(key, liknedHashMap.get(key));
		}
		System.out.println(sortedLiknedHashMap);
		/*
		 * Map<String, Integer> employee = new HashMap<>(); employee.put("Naresh", 2);
		 * employee.put("Pavan", 5); employee.put("Vasavi", 3);
		 * employee.put("Veerababu", 6); employee.put("Dhana Lakshmi", 4);
		 * employee.put("Vamsi", 1); System.out.println(employee); Map<String, Integer>
		 * sortedEmployees = new TreeMap<>(employee);
		 * System.out.println(sortedEmployees); TreeSet<String> keys = new
		 * TreeSet<>(employee.keySet()); System.out.println(keys); Map<String, Integer>
		 * sortedEmployees1 = new LinkedHashMap<>(); Iterator<String> itr =
		 * keys.iterator(); while(itr.hasNext()) { String key = itr.next();
		 * sortedEmployees1.put(key, employee.get(key)); }
		 * System.out.println(sortedEmployees1);
		 */

	}

}
