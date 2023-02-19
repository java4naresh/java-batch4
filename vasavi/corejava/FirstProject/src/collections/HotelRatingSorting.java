package collections;

import java.util.Comparator;

public class HotelRatingSorting implements Comparator<HotelDTO> {

	@Override
	public int compare(HotelDTO o1, HotelDTO o2) {
		
		//return o1.getRating() - o2.getRating();
		
		if(o1.getRating() < o2.getRating()) return 1;
		
		else if(o1.getRating()> o2.getRating()) return -1;
		else return 0;
		
	}

}
