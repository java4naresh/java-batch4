package abstraction;

public class KotakBank extends RBI{
	
	

	public KotakBank(String manager) {
		super(manager);
	}

	@Override
	public void vehicleLoan() {
		System.out.println(8);
	}

}
