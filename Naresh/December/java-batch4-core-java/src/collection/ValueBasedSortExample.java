package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ValueBasedSortExample {

	public static void main(String[] args) {
		Map<String, Integer> persons = new HashMap<>();
		persons.put("Ram", 30);
		persons.put("Aravind", 32);
		persons.put("Arjun", 35);
		persons.put("Krishna", 40);
		persons.put("Hanuma", 50);
		persons.put("Balaji", 30);
		List<Integer> values = new ArrayList<>();
		Set<Entry<String, Integer>> entries = persons.entrySet();
		Iterator<Entry<String, Integer>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			values.add(entry.getValue());
		}
		
		Collections.sort(values);
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		ListIterator<Integer> litr = values.listIterator();
		while(litr.hasNext()) {
			Integer age = litr.next();
			Set<Entry<String, Integer>> entries2 = persons.entrySet();
			Iterator<Entry<String, Integer>> itr2 = entries2.iterator();
			while(itr2.hasNext()) {
				Entry<String, Integer> entry = itr2.next();
				if(entry.getValue().equals(age)) {
					sortedMap.put(entry.getKey(), age);
				}
			}
		}
		System.out.println(sortedMap);
		
	}

}
