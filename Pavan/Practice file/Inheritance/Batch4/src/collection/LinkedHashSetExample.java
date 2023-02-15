package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(25);
		listOfNumbers.add(15);
		listOfNumbers.add(5);
		listOfNumbers.add(35);
		listOfNumbers.add(25);
		listOfNumbers.add(5);
		// Set<Integer> numbers = new LinkedHashSet<>();
		// Set<Integer> numbers = new LinkedHashSet<>(10);
		// Set<Integer> numbers = new LinkedHashSet<>(10, .60f);
		Set<Integer> numbers = new LinkedHashSet<>(listOfNumbers);
		numbers.add(50);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(40);
		System.out.println(numbers);
		// System.out.println(listOfNumbers);

	}

}
