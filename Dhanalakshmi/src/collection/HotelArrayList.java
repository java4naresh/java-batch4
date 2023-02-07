package collection;

import java.util.ArrayList;
import java.util.Collections;

public class HotelArrayList {

	public static void main(String[] args) {
		ArrayList<HotelDTO> hotels = new ArrayList<>();
		HotelDTO hotel1 = new HotelDTO(1, "Spicy");
		HotelDTO hotel2 = new HotelDTO(2, "Sampradhaya");
		HotelDTO hotel3 = new HotelDTO(3, "Udipi");
		HotelDTO hotel4 = new HotelDTO(4, "Sithara");
		HotelDTO hotel5 = new HotelDTO(5, "Ruchi");
		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);	
		hotels.add(hotel1);
		hotels.add(hotel4);
		hotels.add(hotel5);
		System.out.println(hotels);
		hotels.remove(new HotelDTO(1, "Spicy"));
		ArrayList<HotelDTO> hotels2 = new ArrayList<>();
		hotels2.add(new HotelDTO(1, "Spicy"));
		hotels.removeAll(hotels2);
		
		Collections.sort(hotels);
		System.out.println(hotels);
		
	}

}
