package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1000);// 0
		list.add(1);// 1
		list.add(4);// 2
		list.add(32);// 3
		list.add(5);// 4
		list.add(2);// 5
		list.add(1);// 6
		System.out.println(list);
	}

}
