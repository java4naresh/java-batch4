package collection;

import java.util.ArrayList;
import java.util.Collections;

public class HotelArrayList {

	public static void main(String[] args) {
		ArrayList<HotelDTO> hotels = new ArrayList<>();
		HotelDTO hotel1 = new HotelDTO(1, "Udipi");
		HotelDTO hotel2 = new HotelDTO(2, "Raghavendra");
		HotelDTO hotel3 = new HotelDTO(3, "Aparna");
		HotelDTO hotel4 = new HotelDTO(4, "Balaji");
		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel1);
		hotels.add(hotel4);
		System.out.println(hotels);
	    //hotels.remove(new HotelDTO(1, "Udipi"));
	    //ArrayList<HotelDTO> hotels2 = new ArrayList<>();
	    //hotels2.add(new HotelDTO(1, "Udipi"));
	    //hotels.removeAll(hotels2);
		Collections.sort(hotels);
		System.out.println(hotels);
	}

}
