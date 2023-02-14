package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
	//HashSet<Integer> setNumbers = new HashSet<>();
	//Set<Integer> setNumbers = new HashSet<>();
	Set<String> setNames = new HashSet<>();
	Set<Character> setchar = new HashSet<>();
	/*setNumbers.add(5);
	setNumbers.add(10);
	setNumbers.add(20);
	setNumbers.add(50);
	setNumbers.add(40);
	setNumbers.add(50);*/
	setNames.add("Dhanu");
	setNames.add("Charry");
	setNames.add("Varsha");
	System.out.println(setNames);
	setchar.add('D');
	setchar.add('G');
	setchar.add('M');
	System.out.println(setchar);

	Iterator<String> itr = setNames.iterator();
	while(itr.hasNext()) {
	   System.out.println(itr.next());	
	 }
	System.out.println(setNames.contains("Dhanu"));//true
	System.out.println(setNames.contains("Mahi"));//false
	System.out.println(setNames.isEmpty()); //false
	
	/*System.out.println(setNumbers); 
	Iterator<Integer> itr = setNumbers.iterator();
	while(itr.hasNext()) {
	   System.out.println(itr.next());	
	 }*/
	/*System.out.println(setNumbers.contains(10));//true
	System.out.println(setNumbers.contains(100));//false
	System.out.println(setNumbers.isEmpty()); //false
	System.out.println(setNumbers.hashCode());
	System.out.println(setNumbers.size());//5
	
	List<Integer> listNumbers = new ArrayList<>();
	listNumbers.add(3);
	listNumbers.add(4);
	listNumbers.add(1);
	listNumbers.add(2);
	listNumbers.add(4);
	System.out.println(listNumbers);
	//setNumbers.addAll(listNumbers);
	System.out.println(setNumbers);
	System.out.println(setNumbers.isEmpty());//false
	System.out.println(setNumbers.size());//9
	System.out.println(setNumbers.hashCode());
	setNumbers.removeAll(listNumbers);
	System.out.println(setNumbers);*/


	}

}
