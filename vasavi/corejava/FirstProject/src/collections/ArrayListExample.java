package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//ArrayList<String> list =  new ArrayList();
		ArrayList<Integer> list =  new ArrayList(); // ArrayList  creation
		//ArrayList<Character> list =  new ArrayList();
		list.add(100);
		list.add(1);
		list.add(10);
		list.add(26);
		//list.add("vasavi");
		//list.add("vasavi");
		////list.add('A');
		//list.add('C');
		//list.add('z');
		list.add(1);
		
		
		System.out.println(list);
		//System.out.println(list.get(6));
		/*Iterator itr = list.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());   	 
         }*/
		//System.out.println(list.contains('A'));//true
		//System.out.println(list.contains(50));//false
	    //System.out.println(list.size()); //8	
	    //System.out.println(list.lastIndexOf(1));
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
		
		//converting list into array
		
		//Integer[] numbers= (Integer[])list.toArray();
		/*Integer[] arr= new Integer[list.size()]; //array size
		list.toArray(arr);
		for(int i=0; i<arr.length; i++){
	         System.out.println("Element at the index "+i+" is ::"+arr[i]);
		
		
		}
		
		
		//converting array into list
       Integer[] numbers2 = {4,5,8,9,5,2};
        List<Integer> numberList=  Arrays.asList(numbers2);//array into list
        ArrayList<Integer> numberList1 =  new ArrayList();
        Collections.addAll(numberList1,numbers2);
       // System.out.println(numberList1);
        
        for(Integer num:numbers2 ) {
        	//numberList1.add(num);
         }
         System.out.println(numberList1);
        */
        
		//Arrays.asList(1,6,8,9,8,3);
		
}


