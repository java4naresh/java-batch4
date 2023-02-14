package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AverageExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(24);
		list.add(33);
		list.add(77);

		int avg = averageOfArrayList(list);
		System.out.println(avg);
	}

	public static int averageOfArrayList(List<Integer> list) {
		int avg = 0;
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			avg += iterator.next();

		}
		return avg / list.size();
	}

}
