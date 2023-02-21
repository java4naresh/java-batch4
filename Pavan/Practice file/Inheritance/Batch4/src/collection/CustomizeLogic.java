package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CustomizeLogic {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(16);
		list.add(77);
		list.add(7);
		list.add(5);
		list.add(25);
		list.add(14);
		System.out.println(list);
		int[] number = toArray(list);
		System.out.println(Arrays.toString(number));
	}

	public static int[] toArray(ArrayList<Integer> list) {
		int size = list.size();
		int[] number = new int[size];
		Iterator<Integer> iterator = list.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			number[index] = iterator.next();
			index++;
		}
		return number;
	}

	public static ArrayList<Integer> asList(int[] number) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int numbers : number) {
			list.add(numbers);
		}
		return list;
	}

}
