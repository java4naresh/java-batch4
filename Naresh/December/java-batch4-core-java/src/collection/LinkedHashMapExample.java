package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		/*Map<String, Integer> liknedHashMap = new LinkedHashMap<>();
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
		System.out.println(liknedHashMap);*/
		Map<String, Integer> persons = new HashMap<>();
		persons.put("Ram", 30);
		persons.put("Aravind", 32);
		persons.put("Arjun", 35);
		persons.put("Krishna", 40);
		persons.put("Hanuma", 50);
		persons.put("Balaji", 30);
		System.out.println(persons);
		Map<String, Integer> sortedpersons = new TreeMap<>(persons);
		System.out.println(sortedpersons);
		//TreeSet<String> keys = new TreeSet<>(persons.keySet());
		//System.out.println(keys);
		//Map<String, Integer> sortedPersons = new LinkedHashMap<>();
		//Iterator<String> itr = keys.iterator();
		//while(itr.hasNext()) {
		//	String key = itr.next();
		//	sortedPersons.put(key, persons.get(key));
		//}
		//System.out.println(sortedPersons);
		
	}

}
