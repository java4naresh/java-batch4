package collections;

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
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40);
			numbers.add(80);
			numbers.add(70);
			System.out.println(numbers);
			TreeSet<Boolean> truths = new TreeSet<>();
			truths.add(true);
			truths.add(false);
			System.out.println(truths);
		}

	


}
