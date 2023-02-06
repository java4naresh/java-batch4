package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		//ArrayList<String> list =  new ArrayList();
		//ArrayList<Integer> list =  new ArrayList();
		ArrayList<Character> list =  new ArrayList();
		//list.add(100);
		//list.add(1);
		//list.add(10);
		//list.add(26);
		//list.add("vasavi");
		//list.add("vasavi");
		list.add('A');
		list.add('C');
		list.add('z');
		//list.add(1);
		
		
		System.out.println(list);
		//System.out.println(list.get(6));
		/*Iterator itr = list.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());   	 
         }*/
		System.out.println(list.contains('A'));//true
		System.out.println(list.contains(50));//false
	    System.out.println(list.size()); //8	
		 System.out.println(list.lastIndexOf(1));
	     list.remove(5);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}

}
