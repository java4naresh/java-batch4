package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListExample {

	public static void main(String[] args) {
		//List<Integer> list = new LinkedList<>();
		//LinkedList<String> list = new LinkedList<String>();
		Vector<String> vector = new Vector<>(5,5);
		//Vector<String> vector = new Vector<>(5);
	      //List<String> namesList = new ArrayList<>();
		/*list.add(500);//0
		list.add(50);//1
		list.add(25);//2
		list.add(20);//3
		list.add(10);//4
		list.add(19);//5
		list.add(50);//6*/
		list.add("Ammulu");
		list.add("Dhana");
		list.add("Varsha");
		list.add("Abhi");
		list.add("Akshara");
		System.out.println(list);
		
       // System.out.println(list.get(3));
		
		/*Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		//list.remove(4);
		//list.remove("Dhana");
		//System.out.println(list.lastIndexOf(20));
		/*System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	    System.out.println(list.size());//0
	    System.out.println(list.hashCode());//1*/
		
		/*if(list.startsWith("A")) {
			System.out.println((list));
		}*/
	    
	    //Collections.sort(list);
	    //System.out.println(list);
		
	}

}
