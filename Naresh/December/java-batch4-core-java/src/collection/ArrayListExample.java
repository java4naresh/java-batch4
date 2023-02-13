package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
		list.get(1);
        //System.out.println(list);
        //System.out.println(list.get(2));
        /*Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }*/
        //list.remove("Naresh");
       // System.out.println(list.lastIndexOf(1));
        //list.remove(5);
        //System.out.println(list);
        //System.out.println(list.isEmpty());
        //list.clear();
        //System.out.println(list);
        //System.out.println(list.isEmpty());
        //Collections.sort(list);
        //System.out.println(list);
		
		// converting list into array
		Integer[] numbers = (Integer[])list.toArray();
		Integer[] numbers2 = {4,5,6,9,8,10,11,13};
		List<Integer> numbersList = Arrays.asList(numbers2);
		Arrays.asList(1,8,9,3,4);
		int sum = sumOfArrayList(numbersList);
		System.out.println(sum);
        
	}
	
	public static int sumOfArrayList(List<Integer> numbers) {
		int sum = 0;
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
        	System.out.println(itr.next());
        	sum = sum + (Integer)itr.next();
        }
		return sum / numbers.size();
	}

}
