package Client;

import abstraction.ICICIBank;
import abstraction.KotakBank;
import abstraction.RBI;

public class AbstractClassClient {

	public static void main(String[] args) {
		RBI rbi = new ICICIBank();
		rbi.vehicleLoan();
		RBI rbi2 = new KotakBank();
		rbi2.vehicleLoan();
	}
}
