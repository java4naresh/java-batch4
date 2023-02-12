package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class Task {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =  new ArrayList<>();
	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
			
		System.out.println(list);
		
		int sum = 0;
		OptionalInt min;
		OptionalInt max;
	
		
		sum = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println("SUM OF NUMBERS="+ sum);
		    
		OptionalDouble average = list.stream().mapToDouble(i -> i).average();
		System.out.println("Average = " + average);
			
		max = list.stream().mapToInt(Integer::valueOf).max();
		System.out.println("maximum Number="+ max);
		
		min = list.stream().mapToInt(Integer::valueOf).min();
		System.out.println("minimum number="+ min);
		
	
	}
	
}
