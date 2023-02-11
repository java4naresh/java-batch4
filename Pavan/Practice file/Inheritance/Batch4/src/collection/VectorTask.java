package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorTask {

	public static void main(String[] args) {
		Vector<HotelDTO> hotels = new Vector<>();
		HotelDTO hotel1 = new HotelDTO(1, "udipi");
		HotelDTO hotel2 = new HotelDTO(2, "raghavendra");
		HotelDTO hotel3 = new HotelDTO(3, "aparna");
		HotelDTO hotel4 = new HotelDTO(4, "balaji");
		HotelDTO hotel5 = new HotelDTO(5, "annapurna");
		HotelDTO hotel6 = new HotelDTO(6, "sri");
		HotelDTO hotel7 = new HotelDTO(7, "don");
		HotelDTO hotel8 = new HotelDTO(8, "venkateswara");
		HotelDTO hotel9 = new HotelDTO(9, "aadi");
		HotelDTO hotel10 = new HotelDTO(10, "charan");

		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);
		hotels.add(hotel6);
		hotels.add(hotel7);
		hotels.add(hotel8);
		hotels.add(hotel9);
		hotels.add(hotel10);

		System.out.println(hotels);
	}

}
