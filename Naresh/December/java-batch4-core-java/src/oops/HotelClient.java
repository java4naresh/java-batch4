package oops;

import abstraction.AnnapurnaHotel;
import abstraction.Godavari;
import abstraction.Hotel;

public class HotelClient {

	public static void main(String[] args) {
		Hotel hotel = new AnnapurnaHotel();
		hotel.idly();
        hotel.puri();
        
        Hotel hotel2 = new Godavari();
        hotel2.idly();
        hotel2.puri();
        hotel2.dosa();
	}

}
