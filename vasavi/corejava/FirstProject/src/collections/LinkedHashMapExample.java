package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		/*Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("January", 31);
		linkedHashMap.put("February", 28);
		liknedHashMap.put("March", 31);
		linkedHashMap.put("April", 30);
		linkedHashMap.put("May", 31);
		linkedHashMap.put("June", 30);
		linkedHashMap.put("July", 31);
		linkedHashMapp.put("August", 31);
		linkedHashMap.put("September", 30);
		linkedHashMap.put("October", 31);
		linkedHashMap.put("Novemeber", 30);
		linkedHashMap.put("December", 31);
		linkedHashMap.put("January", 31);
		System.out.println(linkedHashMap);*/
		Map<String, Integer> persons = new HashMap<>();
		persons.put("vasavi", 30);
		persons.put("Naresh", 32);
		persons.put("Pavan", 35);
		persons.put("Krishna", 40);
		persons.put("Dhanalakshmi", 50);
		persons.put("Veerababu", 30);
		System.out.println(persons);
		Map<String, Integer> sortedpersons = new TreeMap<>(persons);
		System.out.println(sortedpersons);
		TreeSet<String> keys = new TreeSet<>(persons.keySet());
		System.out.println(keys);
		Map<String, Integer> sortedPersons = new LinkedHashMap<>();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			sortedPersons.put(key, persons.get(key));
		}
		//System.out.println(sortedPersons);
		
	}

}