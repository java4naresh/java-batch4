package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, String> capitals = new HashMap<>();
		capitals.put("AP", "Hyderabad");
		capitals.put("Telangana", "Hyderabad");
		capitals.put("Tamilanadu", "Chennai");
		capitals.put("Karnataka", "Banaglore");
		capitals.put("Kerala", "Trivendram");
		capitals.put("Orissa", "Jharkhand");
		capitals.put("Maharastra", "Mumbai");
		capitals.put("Delhi", "Delhi");
		capitals.put(null, "Goa");
		capitals.put(null, "Poducherry");
		// System.out.println(capitals);
		// System.out.println(capitals.get("MadyaPradesh"));
		/*
		 * Set<String> keys = capitals.keySet(); Iterator<String> itr = keys.iterator();
		 * while(itr.hasNext()) { String key = itr.next();
		 * System.out.println(key+"="+capitals.get(key)); }
		 */
		Set<Entry<String, String>> entries = capitals.entrySet();
		Iterator<Entry<String, String>> entryItr = entries.iterator();
		while (entryItr.hasNext()) {
			Entry<String, String> entry = entryItr.next();
			// System.out.println(entry.getKey()+"="+entry.getValue());
			if ("Jharkhand".equals(entry.getValue())) {
				System.out.println(entry.getKey());
			}
		}

	}

}
