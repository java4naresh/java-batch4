package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HotelArrayList {

	public static void main(String[] args) {
		
		ArrayList<HotelDTO> hotels = new ArrayList<>();
	    HotelDTO  hotel1 = new HotelDTO(1, "Udipi",5);
	    HotelDTO  hotel2 = new HotelDTO(2, "Raghavendra",5);
	    HotelDTO  hotel3 = new HotelDTO(3,"Aparna",4);
	    HotelDTO  hotel4 = new HotelDTO(4,"Taj",4);
	    HotelDTO  hotel5 = new HotelDTO(5,"Balaji",5);
	    HotelDTO  hotel6 = new HotelDTO(6, "Udipi",4);
	    HotelDTO  hotel7 = new HotelDTO(7, "Ajanta",5);
	    HotelDTO  hotel8 = new HotelDTO(8,"Aparna",3);
	    HotelDTO  hotel9 = new HotelDTO(9,"Taj",3);
	    HotelDTO  hotel10 = new HotelDTO(10,"Archana",2);
	    HotelDTO hotel11 = new HotelDTO(15,"Rasoie",3);
		HotelDTO hotel12 = new HotelDTO(11,"AmarawathiHotel",5);

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
	 
	    
	    Iterator itr = hotels.iterator();
	    while(itr.hasNext()) {
	    	HotelDTO hotel = (HotelDTO)itr.next();
	    	
	    	hotel.setHotelName(hotel.getHotelName().toUpperCase());
	    		
	    		System.out.println(hotel);
	    		
	    	}
	    	/*if(hotel.getHotelName().startsWith("A")) {
	    			
	    		System.out.println(hotel);
        	}*/
         
        
	    
	   // Collections.sort(hotels);
	    //System.out.println(hotels);
	    
	    
	    
	    //hotels.remove(new HotelDTO(2, "Raghavendra"));
	    
	//ArrayList<HotelDTO> hotels2 = new ArrayList<>();
	 // hotels2.add(new HotelDTO(1, "Udipi"));
	 // hotels.removeAll(hotels2);
	// System.out.println(hotels);
	    
	    

	}

}
