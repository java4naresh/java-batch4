package com.collections;

import java.util.ArrayList;
import java.util.List;

public class HotalArrayList {

	public static void main(String[] args) {
		
		
		List<HotalDto> hotals=new ArrayList<HotalDto>();
		
		HotalDto hotal1=new HotalDto(1,"udipi","hyderabad");
		HotalDto hotal2=new HotalDto(2,"udipi","hyderabad");
		HotalDto hotal3=new HotalDto(3,"udipi","hyderabad");
		HotalDto hotal4=new HotalDto(4,"udipi","hyderabad");
		HotalDto hotal5=new HotalDto(5,"udipi","hyderabad");
		HotalDto hotal6=new HotalDto(6,"udipi","hyderabad");

		
		hotals.add(hotal1);
		hotals.add(new HotalDto(6,"udipi","hyderabad"));
	}

}
