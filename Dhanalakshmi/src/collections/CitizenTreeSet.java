package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CitizenTreeSet {

	public static void main(String[] args) {
		/*Citizen c1 = new Citizen(1, "Charry", 3, "Indian");
		Citizen c2 = new Citizen(2, "Mahi", 2, "Indian");
		Citizen c3 = new Citizen(3, "Varsha", 18, "Indian");
		Citizen c4 = new Citizen(4, "Pandu", 5, "Indian");
		Citizen c5 = new Citizen(5, "Divi", 16, "Indian");
		Set<Citizen> citizens = new TreeSet<>();
		citizens.add(c1);
		citizens.add(c2);
		citizens.add(c3);
		citizens.add(c4);
		citizens.add(c5);
		System.out.println(citizens);*/
		
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
		Set<Person> PersonsSet = new TreeSet<>(persons);
		System.out.println(PersonsSet);

	}

}
