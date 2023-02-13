package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Multiplication {

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	       list.add(20);
	       list.add(40);
	       list.add(10);
	       list.add(25);
	       
	       int mul = mulOfArrayList(list);
			System.out.println(mul);
	    }
	        public static int mulOfArrayList(List<Integer> list) {
	        int mul = 1;
	        Iterator<Integer> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            mul *= iterator.next();
	        
	        }
	        return mul;

	}

}
