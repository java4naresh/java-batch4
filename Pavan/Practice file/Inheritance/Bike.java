class Bike 
{
	String bikeName;
	int bikeCost;
	public Bike(String bikeName, int bikeCost) {
	}
}

class SpareParts extends Bike
{
	int engineNumber;
	int choiceNumber;
	public SpareParts(String bikeName, int bikeCost, int engineNumber, int choiceNumber) {
      super(bikeName, bikeCost);
	super.bikeName = bikeName;
	super.bikeCost = bikeCost;
	this.engineNumber = engineNumber;
	this.choiceNumber = choiceNumber;
	}
}

class User
{
	public static void main (String [] args) {
    SpareParts sp = new SpareParts("Pulsar", 120000, 123, 456);
	System.out.println(sp.bikename+" "+sp.bikeCost +" "+sp.engineNumber +" "+sp.choiceNumber);
	}
}