package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HasSetExample {

	public static void main(String[] args) {
		//HashSet<Integer> setNumbers = new HashSet<>();
		Set<Integer> setNumbers = new HashSet<>();
		setNumbers.add(10);
		setNumbers.add(20);
		setNumbers.add(30);
		setNumbers.add(50);
		setNumbers.add(5);
		setNumbers.add(30);
		System.out.println(setNumbers);
		Iterator<Integer> itr = setNumbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(setNumbers.contains(40));//
		List<Integer> listNumbers = new ArrayList<>();
		listNumbers.add(2);
		listNumbers.add(3);
		listNumbers.add(4);
		listNumbers.add(6);
		listNumbers.add(2);
		System.out.println(listNumbers);
		setNumbers.addAll(listNumbers);
		System.out.println(setNumbers);
		setNumbers.removeAll(listNumbers);
		System.out.println(setNumbers);
	}

}
