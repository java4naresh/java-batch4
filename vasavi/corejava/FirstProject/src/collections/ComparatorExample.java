package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		Citizen c1 = new Citizen(1,"Pavan Kalyan", 35, "Indian");
		Citizen c2 = new Citizen(2,"Chiranjeevi", 50, "Indian");
		Citizen c3 = new Citizen(3,"Ram Charan", 30, "Indian");
		Citizen c4 = new Citizen(4,"Arjun", 32, "Indian");
		Citizen c5 = new Citizen(5,"Prabhas", 33, "Indian");
		List<Citizen> citizens = Arrays.asList(c1, c2, c3, c4, c5);
		//Collections.sort(citizens, new CitizenNameSorting());
		citizens.sort(new CitizenNameSorting());
		//citizens.sort(new CitizenAgeSorting());
		System.out.println(citizens);

	}

}

