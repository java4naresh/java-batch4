package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CustomizeLogic {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);//0
		list.add(1);//1
		list.add(4);//2
		list.add(32);//3
		list.add(5);//4
		list.add(2);//5
		int[] numbers = toArray(list);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static int[] toArray(ArrayList<Integer> list) {
		int size = list.size();
		int[] numbers = new int[size];
		Iterator<Integer> itr = list.iterator();
		int index = 0;
		while(itr.hasNext()) {
			numbers[index] = itr.next();
			index ++;
		}
		return numbers;
	}
	
	public static ArrayList<Integer> asList(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int number:numbers) {
			list.add(number);
		}
		return list;
	}

}
