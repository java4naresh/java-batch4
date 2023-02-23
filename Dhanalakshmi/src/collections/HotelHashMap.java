package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelHashMap {

	public static void main(String[] args) {
		
		Map<String, HotelDTO> hotels = new HashMap<>();
		/*Map<String, Integer> sampradhayaMenu = new HashMap<>();
		sampradhayaMenu.put("Idly", 20);
		sampradhayaMenu.put("Dosa", 25);
		sampradhayaMenu.put("Voda",20);
		sampradhayaMenu.put("Puri", 30);*/
		MenuDTO menu1 = new MenuDTO("Idly", 20, 3);
		MenuDTO menu2 = new MenuDTO("Dosa", 20, 1);
		MenuDTO menu3 = new MenuDTO("Voda", 20, 1);
		MenuDTO menu4 = new MenuDTO("Puri", 20, 2);
		List<MenuDTO> sampradhayaMenu = Arrays.asList(menu1, menu2, menu3,menu4);
		
		/*Map<String, Integer> udipiMenu = new HashMap<>();
		udipiMenu.put("Masala Dosa",50);
		udipiMenu.put("Chapati", 40);
		udipiMenu.put("Pulka", 30);
		udipiMenu.put("Parota", 35);*/
		MenuDTO menu5 = new MenuDTO("Idly", 20, 2);
		MenuDTO menu6 = new MenuDTO("Dosa", 25, 1);
		MenuDTO menu7 = new MenuDTO("Voda", 20, 1);
		MenuDTO menu8= new MenuDTO("Puri", 25, 2);
		List<MenuDTO> udipiMenu = Arrays.asList(menu5, menu6, menu7, menu8);
		
		HotelDTO hotel1 = new HotelDTO(1, "Sampradhaya", 4, sampradhayaMenu);
		HotelDTO hotel2 = new HotelDTO(2, "Udipi", 5, udipiMenu);
		hotels.put("Sampradhaya", hotel1);
		hotels.put("Udipi", hotel2);
		System.out.println(hotels);

	}

}
