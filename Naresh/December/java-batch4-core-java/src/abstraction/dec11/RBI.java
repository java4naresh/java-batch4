package abstraction.dec11;

public abstract class RBI implements Bank{

	

	@Override
	public void personalLoan() {
		System.out.println(12);
		
	}

	@Override
	public void homeLoan() {
		
		System.out.println(8.7);
	}

	

}
