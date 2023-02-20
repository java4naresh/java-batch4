package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PersonLinkedHashSetExample {

	public static void main(String[] args) {
		Person p1 = new Person(1, "Dhana", "dhana@gmail.com", 40000.00, "Guntur");
		Person p2 = new Person(2, "Charry", "charry@gmail.com", 50000.00, "PDRL");
		Person p3 = new Person(3, "Mahi", "mahi@gmail.com", 30000.00, "Vijayawada");
		Person p4 = new Person(4, "Varsha", "varsha@gmail.com", 20000.00, "HYD");
		Person p5 = new Person(5, "Ramana", "ramana@gmail.com", 10000.00, "Bangalore");
		Person p6 = new Person(1, "Ammu", "dhana@gmail.com", 40000.00, "Guntur");
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		Collections.sort(persons);
		Set<Person> personsSet = new LinkedHashSet<>(persons);
		System.out.println(personsSet);
		
	}

}
