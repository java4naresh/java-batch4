package collections;

import java.util.Comparator;

public class HotelNameSorting implements Comparator<HotelDTO>{

	@Override
	public int compare(HotelDTO o1, HotelDTO o2) {
		
		//return o1.getHotelName().compareTo(o2.getHotelName());
		
		int result = 0;
		int length = (o1.getHotelName().length() < o2.getHotelName().length()) ? o1.getHotelName().length() :
			o2.getHotelName().length();
		for(int i=0;i<length;i++) {
		char ch = o1.getHotelName().charAt(i);
		char ch2 = o2.getHotelName().charAt(i);
		if(ch < ch2) { 
		result = -1;
		break;
		}
		else if(ch > ch2) { 
		result = 1;
		break;
		}
		}
		return result;
	}

}
