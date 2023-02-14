package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(20);
		listOfNumbers.add(30);
		listOfNumbers.add(40);
		listOfNumbers.add(20);
		listOfNumbers.add(35);
		listOfNumbers.add(50);
		System.out.println(listOfNumbers);
		//Set<Integer> numbers = new LinkedHashSet<>();
		//Set<Integer> numbers = new LinkedHashSet<>(10);
		//Set<Integer> numbers = new LinkedHashSet<>(10,.50f);
		Set<Integer> numbers = new LinkedHashSet<>(listOfNumbers);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		System.out.println(numbers);
		

	}

}
