package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {
	
	 public static void main(String[] args) {
		 
		 List<Integer> listOfNumbers = new ArrayList<>();
			listOfNumbers.add(1);
			listOfNumbers.add(1);
			listOfNumbers.add(5);
			listOfNumbers.add(3);
			listOfNumbers.add(2);
			listOfNumbers.add(4);
		 
		    //Set<Integer> numbers = new LinkedHashSet<>();
			//Set<Integer> numbers = new LinkedHashSet<>(10);
			//Set<Integer> numbers = new LinkedHashSet<>(10, .60f);
			Set<Integer> numbers = new LinkedHashSet<>(listOfNumbers);
		    
			numbers.add(10);
			numbers.add(20);
		    numbers.add(30);
			numbers.add(20);
			numbers.add(40);
			numbers.add(50);
			numbers.add(50);
			
			System.out.println(numbers);
		 
	 }

}
