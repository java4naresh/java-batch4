package test;

import abstraction.ICICIBank;
import abstraction.KotakBank;
import abstraction.RBI;

public class AbstractClassTest {

	public static void main(String[] args) {
		RBI rbi = new ICICIBank("Naresh");
		rbi.vehicleLoan();
		RBI rbi2 = new KotakBank("Naresh");
		rbi2.vehicleLoan();
	}
}
