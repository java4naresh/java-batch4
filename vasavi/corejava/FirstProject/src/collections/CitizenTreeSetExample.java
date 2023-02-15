package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CitizenTreeSetExample {
	
	public static void main(String[] args) {

		/*Citizen c1 = new Citizen(1,"Pavan Kalyan", 35, "Indian");
		Citizen c2 = new Citizen(2,"Chiranjeevi", 50, "Indian");
		Citizen c3 = new Citizen(3,"Ram Charan", 30, "Indian");
		Citizen c4 = new Citizen(4,"Arjun", 32, "Indian");
		Citizen c5 = new Citizen(5,"Prabhas", 33, "Indian");
		Set<Citizen> citizens = new TreeSet<>();
		citizens.add(c1);
		citizens.add(c2);
		citizens.add(c3);
		citizens.add(c4);
		citizens.add(c5);
		System.out.println(citizens);*/
		
		Person p1 = new Person(1, "Naresh", "naresh@gmail.com", 50000.00, "Hyderabad");
		Person p2 = new Person(2, "Pavan", "pavan@gmail.com", 40000.00, "Hyderabad");
		Person p3 = new Person(3, "Vasavi", "vasavi@gmail.com", 60000.00, "Hyderabad");
		Person p4 = new Person(4, "Dhanalaxmi", "dhanalakshmi@gmail.com", 20000.00, "Hyderabad");
		Person p5 = new Person(5, "Veerababu", "veerababu@gmail.com", 10000.00, "Hyderabad");
		Person p6 = new Person(6, "Vamsi", "vamsi@gmail.com", 50000.00, "Hyderabad");
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
