package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//ArrayList<String> list = new ArrayList<String>();//Creating arraylist
		list.add(500);//0
		list.add(50);//1
		list.add(25);//2
		list.add(20);//3
		list.add(10);//4
		list.add(19);//5
		list.add(26);//6
		//list.add("Dhanu");//7 Adding object in arraylist
		//list.add("Dhana");//8
		//list.add('G');//9
		//list.add('C');//10
		list.add(26);//11
		System.out.println(list);
		//System.out.println(list.get(3));
		
		/*Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		//list.remove(8);
		list.remove("Dhana");
		System.out.println(list.lastIndexOf(26));
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	    System.out.println(list.size());//0
	    System.out.println(list.hashCode());//1
	    			
	}	
		
}


