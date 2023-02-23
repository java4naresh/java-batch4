package collections;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {	

		public static void main(String[] args) {
			/*Map<Integer, String> heroes = new HashMap<>();
			heroes.put(1, "Chiranjeevi");
			heroes.put(2, "Balakrishna");
			heroes.put(3, "Venkatesh");
			heroes.put(4, "Nagarjuna");
			System.out.println(heroes);
			heroes.put(1, "Pavan Kalyan");
			heroes.put(2, "NTR");
			heroes.put(3, "Rana");
			heroes.put(4, "NagaChaitanya");
			System.out.println(heroes);*/
			
			/*Map<Integer, String> players = new HashMap<>();
			players.put(1, "Rohit");
			players.put(2, "Rahul");
			players.put(3, "Kohli");
			players.put(4, "Surya");
			players.put(5, "Pandya");
			players.put(6, "Jadeja");
		
			System.out.println(players);*/
			/*Map<String, String> fruits = new HashMap<>();
			fruits.put("Banana", "Yellow");
			fruits.put("Apple", "Red");
			fruits.put("Guava", "Green");
			fruits.put("Grape", "Black");
			fruits.put("Mango", "Green");
			fruits.put("Dragon", "Red");
			System.out.println(fruits);*/
			Map<String, String> capitals = new HashMap<>();
			capitals.put("AP", null);
			capitals.put("Telangana", "Hyderabad");
			capitals.put("Tamilanadu", "Chennai");
			capitals.put("Karnataka", "Banaglore");
			capitals.put("Kerala", "Trivendram");
			capitals.put("Orissa", "Jharkhand");
			capitals.put("Maharastra", "Mumbai");
			capitals.put("Delhi", "Delhi");
			capitals.put(null, "goa");
			System.out.println(capitals);
			System.out.println(capitals.get("Maharastra"));
		}
}
