package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PersonLinkedHashSetExample {

	public static void main(String[] args) {
		Person p1 = new Person(1, "Naresh", "naresh@gmail.com", 50000.00, "Hyderabad");
		Person p2 = new Person(2, "Naresh", "naresh1@gmail.com", 40000.00, "Hyderabad");
		Person p3 = new Person(3, "Naresh", "naresh2@gmail.com", 60000.00, "Hyderabad");
		Person p4 = new Person(4, "Naresh", "naresh3@gmail.com", 20000.00, "Hyderabad");
		Person p5 = new Person(5, "Naresh", "naresh4@gmail.com", 10000.00, "Hyderabad");
		Person p6 = new Person(1, "Naresh", "naresh@gmail.com", 50000.00, "Hyderabad");
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
