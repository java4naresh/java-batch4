package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		
		/*Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		ListIterator<Integer> listItr = numbers.listIterator();
		int index = 1;
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
			index++;
			if(index == 3) break;
		}
		System.out.println("Forward Direction Completed");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

	}

}
