package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithOutGeneric {

	public static void main(String[] args) {
		//List<Integer> list = new ArrayList<>();
		List list = new ArrayList<>();
		//List<String> list = new ArrayList<>();
		list.add("Dhana");
		list.add(10);
		list.add(20);
		list.add('G');
		list.add(55);
		list.add("Mannem");
		list.add(new HotelDTO());
		
		int sum = 0;
		String word = "";
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object numObj =  itr.next();
			if(numObj instanceof Integer) {
				int num = (Integer)numObj;
				sum = sum + num;
			}else if (numObj instanceof String) {
				word = word + (String)numObj + " , ";
			}else if (numObj instanceof HotelDTO) {
				System.out.println(numObj);
				//word = word + " " + (String)numObj;
				//word = word + " , " + (String)numObj;
				if (word.endsWith(", ")) {
					word = word.substring(0, word.length() - 2);
				}
				
			}
		
		}
		System.out.println(sum);
		System.out.println(word.trim());
	
	}

}
