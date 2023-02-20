package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		Citizen c1 = new Citizen(1, "Charry", 3, "Indian");
		Citizen c2 = new Citizen(2, "Mahi", 2, "Indian");
		Citizen c3 = new Citizen(3, "Varsha", 18, "Indian");
		Citizen c4 = new Citizen(4, "Pandu", 5, "Indian");
		Citizen c5 = new Citizen(5, "Divi", 16, "Indian");
		List<Citizen> citizens = Arrays.asList(c1, c2, c3, c4, c5);
		Collections.sort(citizens,new CitizenNameSorting());
		//citizens.sort(new CitizenNameSorting());
		//citizens.sort(new CitizenAgeSorting());
		System.out.println(citizens);
		

	}

}
