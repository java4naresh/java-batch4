package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList();
		ArrayList<Integer> list = new ArrayList();
		// ArrayList<Character> list = new ArrayList();
		list.add(7);
		list.add(11);
		list.add(77);
		list.add(224);
		// list.add("Pavan");
		// list.add("Triveni");
		//// list.add('V');
		// list.add('P');
		// list.add('T');
		list.add(1);

		System.out.println(list);
		// System.out.println(list.get(6));
		/*
		 * Iterator itr = list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		// System.out.println(list.contains('V'));
		// System.out.println(list.contains(24));
		// System.out.println(list.size());
		// System.out.println(list.lastIndexOf(1));
		// list.remove(5);
		// System.out.println(list);
		// System.out.println(list.isEmpty());
		// list.clear();
		// System.out.println(list);
		// System.out.println(list.isEmpty());
		Collections.sort(list);
		System.out.println(list);
	}

}
