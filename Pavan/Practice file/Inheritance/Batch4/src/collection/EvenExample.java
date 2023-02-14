package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenExample {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(12);
		list.add(17);
		list.add(50);
		list.add(23);
		list.add(11);

		System.out.println(list);
		List<Integer> evenNumber = evenOfArrayList(list);
		System.out.println(evenNumber);
	}

	public static List<Integer> evenOfArrayList(List<Integer> list) {
		List<Integer> evenNumber = new ArrayList<>();
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num % 2 == 0) {
				evenNumber.add(num);
			}

		}
		return evenNumber;

	}
}
