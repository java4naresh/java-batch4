package collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("Naresh");
		names.add("Pavan");
		names.add("Vasavi");
		names.add("Dhanalaxmi");
		names.add("Veerababu");
		names.add("Vamsi");
		System.out.println(names);
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(14);
		numbers.add(19);
		numbers.add(12);
		numbers.add(10);
		numbers.add(8);
		numbers.add(7);
		System.out.println(numbers);
		TreeSet<Boolean> truths = new TreeSet<>();
		truths.add(true);
		truths.add(false);
		System.out.println(truths);
	}

}
