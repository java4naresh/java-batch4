package abstraction.dec11;


	public abstract class  RBI implements Bank {

		@Override
		public void goldLoan() {
			System.out.println(13);
			
		}

		@Override
		public void personalLoan() {
			System.out.println(9.5);	
			
		}

}
