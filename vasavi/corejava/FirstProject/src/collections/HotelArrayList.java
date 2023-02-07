package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelArrayList {

	public static void main(String[] args) {
		
		ArrayList<HotelDTO> hotels = new ArrayList<>();
	    HotelDTO  hotel1 = new HotelDTO(1, "Udipi");
	    HotelDTO  hotel2 = new HotelDTO(2, "Raghavendra");
	    HotelDTO  hotel3= new HotelDTO(3,"Aparna");
	    HotelDTO  hotel4= new HotelDTO(4,"Taj");
	    HotelDTO  hotel5= new HotelDTO(5,"Balaji");
	    
	    hotels.add(hotel1);
	    hotels.add(hotel2);
	    hotels.add(hotel3);
	    hotels.add(hotel4);
	    hotels.add(hotel5);
	
	    System.out.println(hotels);
	    
	    Collections.sort(hotels);
	    System.out.println(hotels);
	    
	    
	    
	    //hotels.remove(new HotelDTO(2, "Raghavendra"));
	    
	//ArrayList<HotelDTO> hotels2 = new ArrayList<>();
	 // hotels2.add(new HotelDTO(1, "Udipi"));
	 // hotels.removeAll(hotels2);
	// System.out.println(hotels);
	    
	    

	}

}
