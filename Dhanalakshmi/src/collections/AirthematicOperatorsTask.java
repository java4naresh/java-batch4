package collections;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AirthematicOperatorsTask {

	public static void main(String[] args) {

		ArrayList<Integer> list =  new ArrayList<>();
		list.add(5);
		list.add(25);
		list.add(30);
		list.add(40);
		list.add(60);
		list.add(70);
		list.add(75);
		list.add(50);
		list.add(100);
		
		int sum = 0;
		
		sum = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println("SUM OF NUMBERS="+ sum);
		    
		 OptionalDouble average = list.stream().mapToDouble(i -> i).average();
		System.out.println("Average = " + average);
		
		
		OptionalInt max = list.stream().mapToInt(Integer::valueOf).max();
		System.out.println("maximum Number="+ max);
		
		OptionalInt min = list.stream().mapToInt(Integer::valueOf).min();
		System.out.println("minimum number="+ min);

		
	}

}
