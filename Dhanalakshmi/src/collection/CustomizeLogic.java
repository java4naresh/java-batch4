package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CustomizeLogic {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(500);//0
		list.add(50);//1
		list.add(25);//2
		list.add(20);//3
		list.add(10);//4
		list.add(19);//5
		list.add(26);//6
		int[] numbers = toArray(list);
		System.out.println(Arrays.toString(numbers));
		
	}
	
		public static int[] toArray(ArrayList<Integer> list) {
			int size = list.size();
			int[] numbers = new int[size];
			Iterator<Integer> itr = list.iterator();
			int index = 0;
			while(itr.hasNext()) {
				numbers[index] = itr.next();
				index ++;
			}
			return numbers;	
	}
		
		public static ArrayList<Integer> asList(int[] numbers){
			 ArrayList<Integer> list = new ArrayList<>();
			// for(int number:numbers) {
			 for(int i=0; i< numbers.length; i++)
				//list.add(number); 
				 list.add(numbers [i]);
				 
			 }
			 return list; 
			
		}
		
}
