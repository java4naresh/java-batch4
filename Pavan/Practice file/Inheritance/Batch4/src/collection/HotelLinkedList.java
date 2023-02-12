package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class HotelLinkedList {
	public static void main(String[] args) {

		LinkedList<HotelDTO> hotels = new LinkedList<>();
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
		hotels.add(hotel6);
		hotels.add(hotel7);
		hotels.add(hotel8);
		hotels.add(hotel9);
		hotels.add(hotel10);
		hotels.add(hotel11);
		hotels.add(hotel12);
		hotels.add(hotel13);
		hotels.add(hotel14);
		hotels.add(hotel15);
		hotels.add(hotel16);
		hotels.add(hotel17);
		hotels.add(hotel18);
		hotels.add(hotel19);
		hotels.add(hotel20);

		Iterator itr = hotels.iterator();
		while (itr.hasNext()) {
			HotelDTO hotel = (HotelDTO) itr.next();
			if (hotel.getHotelName().startsWith("A")) {

				System.out.println(hotel);
			}
		}
	}

}