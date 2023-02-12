package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HotelArrayList {

	public static void main(String[] args) {
		
		ArrayList<HotelDTO> hotels = new ArrayList<>();
	    HotelDTO  hotel1 = new HotelDTO(1, "Udipi");
	    HotelDTO  hotel2 = new HotelDTO(2, "Raghavendra");
	    HotelDTO  hotel3 = new HotelDTO(3,"Aparna");
	    HotelDTO  hotel4 = new HotelDTO(4,"Taj");
	    HotelDTO  hotel5 = new HotelDTO(5,"Balaji");
	    HotelDTO  hotel6 = new HotelDTO(6, "Udipi");
	    HotelDTO  hotel7 = new HotelDTO(7, "Ajanta");
	    HotelDTO  hotel8 = new HotelDTO(8,"Aparna");
	    HotelDTO  hotel9 = new HotelDTO(9,"Taj");
	    HotelDTO  hotel10 = new HotelDTO(10,"Archana");
	    HotelDTO hotel11 = new HotelDTO(15,"Rasoie");
		HotelDTO hotel12 = new HotelDTO(11,"AmarawathiHotel");
		HotelDTO hotel13 = new HotelDTO(12,"Sitara");
		HotelDTO hotel14 = new HotelDTO(13,"Marigold");
		HotelDTO hotel15 = new HotelDTO(14,"Athidhi");
		HotelDTO hotel16 = new HotelDTO(16,"Kakatiya");
		HotelDTO hotel17 = new HotelDTO(17,"ArtBoutique");
		HotelDTO hotel18 = new HotelDTO(18,"Taj");
		HotelDTO hotel19 = new HotelDTO(19,"Sheraton");
		HotelDTO hotel20 = new HotelDTO(20,"Avasa");
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
