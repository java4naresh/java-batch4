package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Even {
	
	public static void main(String[] args) {
		
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
      
        System.out.println(list);
        List<Integer> evenNumber = evenOfArrayList(list);
        System.out.println(evenNumber);
    }

    public static List<Integer> evenOfArrayList(List<Integer> list) {
    	List<Integer> evenNumber = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                evenNumber.add(num);
        }
        
    }
       return evenNumber;
   }
}