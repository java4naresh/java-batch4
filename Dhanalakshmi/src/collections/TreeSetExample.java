package collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("Dhana");
		names.add("Vasavi");
		names.add("Naresh");
		names.add("Pavan");
		names.add("Vamsi");
		names.add("Veerababu");
		System.out.println(names);
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(19);
		numbers.add(26);
		numbers.add(30);
		numbers.add(25);
		System.out.println(numbers);
		TreeSet<Character> letters = new TreeSet<>();
		letters.add('D');
		letters.add('G');
		letters.add('A');
		letters.add('C');
		System.out.println(letters);
		TreeSet<Boolean> truths = new TreeSet<>();
		truths.add(true);
		truths.add(false);
		System.out.println(truths);

	}

}
