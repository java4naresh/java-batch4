package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelHashMap {

	public static void main(String[] args) {

		Map<String, HotelDTO> hotels = new HashMap<>();
		/*Map<String, Integer> annapurnaMenu = new HashMap<>();
		annapurnaMenu.put("Idly", 20);
		annapurnaMenu.put("Dosa", 25);
		annapurnaMenu.put("Masala Dosa", 30);
		annapurnaMenu.put("Puri", 30);*/
		MenuDTO menu1 = new MenuDTO("Idly", 20, 3);
		MenuDTO menu2 = new MenuDTO("Dosa", 25, 1);
		MenuDTO menu3 = new MenuDTO("Masala Dosa", 30, 1);
		MenuDTO menu4 = new MenuDTO("Puri", 30, 3);
		List<MenuDTO> annapurnaMenu = Arrays.asList(menu1, menu2, menu3, menu4);
		
		/*Map<String, Integer> udipiMenu = new HashMap<>();
		udipiMenu.put("Idly", 30);
		udipiMenu.put("Dosa", 35);
		udipiMenu.put("Masala Dosa", 40);
		udipiMenu.put("Puri", 30);
		udipiMenu.put("rava dosa", 50);*/
		MenuDTO menu5 = new MenuDTO("Idly", 30, 3);
		MenuDTO menu6 = new MenuDTO("Dosa", 35, 1);
		MenuDTO menu7 = new MenuDTO("Masala Dosa", 40, 1);
		MenuDTO menu8 = new MenuDTO("Puri", 30, 3);
		MenuDTO menu9 = new MenuDTO("Puri", 50, 1);
		List<MenuDTO> udipiMenu = Arrays.asList(menu5, menu6, menu7, menu8, menu9);
		
		HotelDTO hotel1 = new HotelDTO(1, "Annapurna", annapurnaMenu);
		HotelDTO hotel2 = new HotelDTO(2, "Udipi", udipiMenu);
		hotels.put("Annapurna", hotel1);
		hotels.put("Udipi", hotel2);
		System.out.println(hotels);
	}

}
