package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1000);//0
		list.add(1);//1
		list.add(4);//2
		list.add(32);//3
		list.add(5);//4
		list.add(2);//5
		//list.add("Naresh");//6
		//list.add('N');//7
		list.add(1);//8
        System.out.println(list);
        //System.out.println(list.get(2));
        /*Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }*/
        //list.remove("Naresh");
        System.out.println(list.lastIndexOf(1));
        list.remove(5);
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        
        
	}

}