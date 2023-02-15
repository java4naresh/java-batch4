package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PersonLinkedHashSetExample {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Naresh", "naresh@gmail.com", 50000.00, "Hyderabad");
		Person p2 = new Person(2, "Pavan", "pavan@gmail.com", 10000.00, "Bangalore");
		Person p3 = new Person(3, "Vasavi", "vasavi@gmail.com", 60000.00, "Pune");
		Person p4 = new Person(4, "Veerababu", "veeru@gmail.com", 20000.00, "Chennai");
		Person p5 = new Person(5, "Dhanalakshmi", "dhana@gmail.com", 30000.00, "Pune");
		Person p6 = new Person(6, "Vamsi", "vamsi@gmail.com", 43000.00, "Chennai");
		Person p7 = new Person(1, "Naresh", "naresh@gmail.com", 50000.00, "Hyderabad");
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		Collections.sort(persons);
		Set<Person> personsSet = new LinkedHashSet<>(persons);
		System.out.println(personsSet);

	}

}
