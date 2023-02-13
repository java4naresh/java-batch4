package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Minimum {
	
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        int min = minOfArrayList(list);
		System.out.println(min);
    }
        public static int minOfArrayList(List<Integer> list) {
        	
        	int min = Integer.MAX_VALUE;
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                int num= iterator.next();
                if (num < min) {
                    min = num;
                }
              
            }
            return min;
        }	            
}
