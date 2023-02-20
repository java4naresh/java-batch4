package collection;

import java.util.ArrayList;
import java.util.Vector;

public class HotelVector {

	private static String[] hotelName;

	public static void main(String[] args) {
		Vector<HotelDTO2> hotels = new Vector<>();
		//ArrayList<HotelDTO2> hotels = new ArrayList<>();
		HotelDTO2 hotel1 = new HotelDTO2("Annapurna");
		HotelDTO2 hotel2 = new HotelDTO2("Spicy");
		HotelDTO2 hotel3 = new HotelDTO2("Abhiruchi");
		HotelDTO2 hotel4 = new HotelDTO2("Balaji");
		HotelDTO2 hotel5 = new HotelDTO2("Barbeque");
		HotelDTO2 hotel6 = new HotelDTO2("RustedSpoon");
		HotelDTO2 hotel7 = new HotelDTO2("SweetMagic");
		HotelDTO2 hotel8 = new HotelDTO2("BabaiHotel");
		HotelDTO2 hotel9 = new HotelDTO2("PistaHouse");
		HotelDTO2 hotel10 = new HotelDTO2("Anwitha");
		HotelDTO2 hotel11 = new HotelDTO2("Rasoie");
		HotelDTO2 hotel12 = new HotelDTO2("AmarawathiHotel");
		HotelDTO2 hotel13 = new HotelDTO2("Sitara");
		HotelDTO2 hotel14 = new HotelDTO2("Marigold");
		HotelDTO2 hotel15 = new HotelDTO2("Athidhi");
		HotelDTO2 hotel16 = new HotelDTO2("Kakatiya");
		HotelDTO2 hotel17 = new HotelDTO2("ArtBoutique");
		HotelDTO2 hotel18 = new HotelDTO2("Taj");
		HotelDTO2 hotel19 = new HotelDTO2("Sheraton");
		HotelDTO2 hotel20 = new HotelDTO2("Avasa");
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
		System.out.println(hotels);


	}

}
