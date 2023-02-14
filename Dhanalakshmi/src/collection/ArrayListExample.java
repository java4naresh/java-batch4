 package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
		list.get(100);
		System.out.println(list);
		//System.out.println(list.get(3));
         list.remove(2);
		
		/*Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		//list.remove(8);
		//list.remove("Dhana");
		//System.out.println(list.lastIndexOf(26));
		//System.out.println(list);
		//System.out.println(list.isEmpty());
		//System.out.println(list.toString());
		//list.clear();
		//System.out.println(list);
		//System.out.println(list.isEmpty());
	   // System.out.println(list.size());//0
	    //System.out.println(list.hashCode());//1
	    
	    //Collections.sort(list);
	    //System.out.println(list);
	    		
		// converting list into Array
		  /* Integer[] numbers =  (Integer[])list.toArray();
		   Integer[] numbers2 = {5,6,8,7,22,10,45,78,10};
		   List<Integer> numberList = Arrays.asList(numbers2);
		   Arrays.asList(4,8,6,7,2,3);*/
		

		//converting list into array
		
		//Integer[] numbers = (Integer[])list.toArray();
		Integer[] arr= new Integer[list.size()];
		list.toArray(arr);
		for(int i=0; i<arr.length; i++){
	         System.out.println("Element at the index "+i+" is ::"+arr[i]);
		
		
		}
		
		//converting array into list
	       Integer[] numbers2 = {4,5,8,9,5,2};
	        List<Integer> numberList=  Arrays.asList(numbers2);//array into list
	        ArrayList<Integer> numberList1 =  new ArrayList();
	        Collections.addAll(numberList1,numbers2);
	        System.out.println(numberList1);
		
	        /*for(Integer num:numbers2 ) {
     	numberList1.add(num);
      }
       System.out.println(numberList1);
       */
		//Arrays.asList(1,6,8,9,8,3);
		  
	}	   
		
}


