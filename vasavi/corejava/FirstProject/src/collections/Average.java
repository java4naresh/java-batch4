package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Average {
	
	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        
	        int avg = averageOfArrayList(list);
			System.out.println(avg);
	    }
	        public static int averageOfArrayList(List<Integer> list) {
	        int avg=0;
	        Iterator<Integer> iterator = list.iterator();
	        while (iterator.hasNext()) {
	          avg += iterator.next();
	        
	        }
	        return avg/list.size();	        
	}

}
