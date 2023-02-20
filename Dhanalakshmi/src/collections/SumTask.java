package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumTask {

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	       list.add(20);
	       list.add(40);
	       list.add(10);
	       list.add(25);
	        
	        int sum = sumOfArrayList(list);
			System.out.println(sum);
	    }
	        public static int sumOfArrayList(List<Integer> list) {
	        int sum = 0;
	        Iterator<Integer> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            sum += iterator.next();
	        
	        }
	        return sum;
	        
	}
}


	


