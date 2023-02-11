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
		HotelDTO hotel5 = new HotelDTO(5, "Annapurna");
		HotelDTO hotel6 = new HotelDTO(6, "Sri");
		HotelDTO hotel7 = new HotelDTO(7, "Don");
		HotelDTO hotel8 = new HotelDTO(8, "Venkateswara");
		HotelDTO hotel9 = new HotelDTO(9, "Aadi");
		HotelDTO hotel10 = new HotelDTO(10, "Charan");
		HotelDTO hotel11 = new HotelDTO(11, "Amrutham");
		HotelDTO hotel12 = new HotelDTO(12, "Vasuki");
		HotelDTO hotel13 = new HotelDTO(13, "Kfc");
		HotelDTO hotel14 = new HotelDTO(14, "Cream Stone");
		HotelDTO hotel15 = new HotelDTO(15, "Almas");
		HotelDTO hotel16 = new HotelDTO(16, "Ganga");
		HotelDTO hotel17 = new HotelDTO(17, "Dani");
		HotelDTO hotel18 = new HotelDTO(18, "Veera");
		HotelDTO hotel19 = new HotelDTO(19, "Nag");
		HotelDTO hotel20 = new HotelDTO(20, "Akash");

		hotels.add(hotel1);
		hotels.add(hotel2);
		hotels.add(hotel3);
		hotels.add(hotel4);
		hotels.add(hotel5);
		System.out.println(hotels);
		
		// hotels.remove(new HotelDTO(1, "Udipi"));
		// ArrayList<HotelDTO> hotels2 = new ArrayList<>();
		// hotels2.add(new HotelDTO(1, "Udipi"));
		// hotels.removeAll(hotels2);
		Collections.sort(hotels);
		System.out.println(hotels);
	}

}
