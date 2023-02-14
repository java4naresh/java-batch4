package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiplicationExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		int mul = mulOfArrayList(list);
		System.out.println(mul);
	}

	public static int mulOfArrayList(List<Integer> list) {
		int mul = 2;
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			mul *= iterator.next();

		}
		return mul;

	}

}
