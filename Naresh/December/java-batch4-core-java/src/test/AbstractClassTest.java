package test;

import abstraction.ICICIBank;
import abstraction.KotakBank;
import abstraction.RBI;

public class AbstractClassTest {

	public static void main(String[] args) {
		RBI rbi = new ICICIBank();
		rbi.vehicleLoan();
		RBI rbi2 = new KotakBank();
		rbi2.vehicleLoan();
	}
}
