package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
	       list.add(20);
	       list.add(40);
	       list.add(10);
	       list.add(25);
	       
	       int avg = AverageOfArrayList(list);
	    			System.out.println(avg);
	    	    }
	    	        public static int AverageOfArrayList(List<Integer> list) {
	    	        int avg = 0;
	    	        Iterator<Integer> iterator = list.iterator();
	    	        while (iterator.hasNext()) {
	    	            avg += iterator.next();
	    	        
	    	        }
	    	        return avg/list.size();

	}

}
