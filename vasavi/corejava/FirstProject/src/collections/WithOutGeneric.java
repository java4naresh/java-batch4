package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithOutGeneric {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Naresh");
		list.add(10);
		list.add(20);
		list.add('K');
		list.add(30);
		list.add("Kambala");
		list.add("pavan");
		list.add("dhanalakashmi");
		list.add("vasavi");
		list.add(new HotelDTO());
		
		int sum = 0;
		String word = "";
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object numObj = itr.next();
			if(numObj instanceof Integer) {
				int num = (Integer)numObj;
				sum = sum + num;
			} else if (numObj instanceof String) {
				 if (!word.isEmpty()) {
	                    word += ",";
	                }
	                word += (String)numObj;
				//word = word + (word.isEmpty() ? "" : ", ") + (String)numObj;
			  //word = word + " ," + (String)numObj ;
			 
			} else if (numObj instanceof HotelDTO) {
				System.out.println(numObj);
			}
			
		}
		System.out.println(sum);
		System.out.println(word.trim());

	}

}
