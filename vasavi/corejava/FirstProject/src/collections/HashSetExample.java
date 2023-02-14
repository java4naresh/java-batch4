package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		HashSet<Integer> setNumbers = new HashSet<>();
		//HashSet<Character> setNumbers = new HashSet<>();
		//Set<String> setNumbers = new HashSet<>();
		//Set<Integer> setNumbers = new HashSet<>();
		//Set<Float> setNumbers = new HashSet<>();
		
		setNumbers.add(10);
		setNumbers.add(20);
		setNumbers.add(30);
		setNumbers.add(40);
		setNumbers.add(50);
		setNumbers.add(50);
		//setNumbers.add('A');
		//setNumbers.add('B');
		//setNumbers.add('C');
		//setNumbers.add("va");
		//setNumbers.add("vas");
		//setNumbers.add("vasa");
		//setNumbers.add("vasavi");
		//setNumbers.add((float) 10.0);
		//setNumbers.add((float) 20.0);
		//setNumbers.add((float) 30.0);
		//setNumbers.add((float) 40.0);
		
		
		
		System.out.println(setNumbers);
		
		Iterator<Integer> itr = setNumbers.iterator();
		//Iterator<Character> itr = setNumbers.iterator();
		//Iterator<String> itr = setNumbers.iterator();
		//Iterator<Float> itr = setNumbers.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	  /*  System.out.println(setNumbers.contains(70));
	    List<Integer> listNumbers = new ArrayList<>();
	   
	    listNumbers.add(2);
	    listNumbers.add(5);
	    listNumbers.add(7);
	    listNumbers.add(7);
	    listNumbers.add(5);
	    System.out.println(listNumbers);
	  //  setNumbers.addAll(listNumbers);
	    System.out.println(setNumbers); 
	    setNumbers.removeAll(listNumbers);
	    System.out.println(setNumbers);
	    
        	*/
	}
	
	

}
