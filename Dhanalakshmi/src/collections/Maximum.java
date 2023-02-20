package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Maximum {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
	       list.add(20);
	       list.add(40);
	       list.add(10);
	       list.add(25);
	       System.out.println(list);
	       
	       int max = maxOfArrayList(list);
	  			System.out.println(max);
	  	    }
	  	        public static int maxOfArrayList(List<Integer> list) {
	  	        	
	  	        	int max = Integer.MIN_VALUE;
	  	            Iterator<Integer> iterator = list.iterator();
	  	            while (iterator.hasNext()) {
	  	                int num= iterator.next();
	  	                if (num > max) {
	  	                    max = num;
	  	                }
	  	              
	  	            }
	  	            return max;

	}

}
