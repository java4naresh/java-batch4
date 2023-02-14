package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MinAndMax {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1000);
		list.add(1);
		list.add(4);
		list.add(32);
		list.add(5);
		list.add(2);
		// int max = toArray(list);
		// System.out.println(max);
		int min = toArray(list);
		System.out.println(min);

	}

	public static int toArray(ArrayList<Integer> list) {

		/*
		 * int max = Integer.MIN_VALUE; Iterator<Integer> iterator = list.iterator();
		 * while (iterator.hasNext()) { int num= iterator.next(); if (num > max) { max =
		 * num; }
		 */

		int min = Integer.MAX_VALUE;
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num < min) {
				min = num;
			}

		}
		// return max;
		return min;
	}

}
