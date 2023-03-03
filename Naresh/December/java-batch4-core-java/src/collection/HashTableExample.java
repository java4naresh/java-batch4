package collection;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String, String> capitals = new Hashtable<>();
		capitals.put("AP", "Hyderabad");
		capitals.put("Telangana", "Hyderabad");
		capitals.put("Tamilanadu", "Chennai");
		capitals.put("Karnataka", "Banaglore");
		capitals.put("Kerala", "Trivendram");
		capitals.put("Orissa", "Jharkhand");
		capitals.put("Maharastra", "Mumbai");
		capitals.put("Delhi", "Delhi");
		//capitals.put(null, "Goa");
		//capitals.put(null, "Poducherry");
		System.out.println(capitals);

	}

}
