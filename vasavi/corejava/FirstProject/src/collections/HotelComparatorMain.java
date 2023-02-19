package collections;


import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class HotelComparatorMain {
	public static void main(String[] args) {
		
    HotelDTO  h1 = new HotelDTO(1, "Udipi",5);
    HotelDTO  h3 = new HotelDTO(3,"Aparna",3);
    HotelDTO  h4 = new HotelDTO(4,"Taj",4);
    HotelDTO  h5 = new HotelDTO(5,"Balaji",2);
    HotelDTO  h2 = new HotelDTO(2, "Raghavendra",4);
   
 

    List<HotelDTO> hotel = Arrays.asList(h1, h3, h4, h5, h2);
    //Collections.sort(hotel, new HotelRatingSorting());
    //Collections.sort(hotel, new HotelIdSorting());
   // Collections.sort(hotel, new HotelNameSorting());
    //hotel.sort(new HotelRatingSorting());
    //hotel.sort(new HotelIdSorting());
    hotel.sort(new HotelNameSorting());
    System.out.println(hotel);
	
	
}	

}
