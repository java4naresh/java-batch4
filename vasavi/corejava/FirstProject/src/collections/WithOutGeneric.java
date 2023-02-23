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
		int index = 1;
		/*while(itr.hasNext()) {
			Object numObj = itr.next();
			if(numObj instanceof Integer) {
				int num = (Integer)numObj;
				sum = sum + num;
			} else if (numObj instanceof String) {
				//word = word + " " + (String)numObj ;
				//if (numObj != word) {
				//	word = word + (String) numObj + ",";

				//	word = word.substring(0, word.length() - 1);

				//}
				if(index != list.size()) {
				//word = word + " , " + (String)numObj;
					word = word + (String) numObj + ",";
				} else word = word + (String) numObj;
				if (word.endsWith(" , ")) {
					word = word.substring(0, word.length() - 2);
				}
			} else if (numObj instanceof HotelDTO) {
				System.out.println(numObj);
			}
			if(index == list.size()) {
				if(word.endsWith(",")) {
					word = word.substring(0, word.length() - 1);
				}
			}
			index++;
		}*/
		
		
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
			}
		
		}
		word = word.trim();
		if (word.endsWith(",")) {
			word = word.substring(0, word.length() - 1);
		}
		System.out.println(sum);
		System.out.println(word.trim());

	}

}
