package collection;

import java.util.Comparator;

public class HotelIdSorting implements Comparator<HotelDTO> {

	@Override
	public int compare(HotelDTO o1, HotelDTO o2) {
		//return o1.getHotelId() - o2.getHotelId();
		
		if(o1.getHotelId() < o2.getHotelId()) return -1;
		
		else if(o1.getHotelId()> o2.getHotelId()) return 1;
		else return 0;
	}
	
}
