class Vehicle 
{
	String brand;
	int cost;
	int model;

	public Vehicle(String brand, int cost, int model){
		
	}
}

class Tyres extends Vehicle
{
	String tyreName;
	int tyreCost;
	String tyreType;

	public Tyres(String brand, int cost, int model, String tyreName, int tyreCost, String tyreType){
      super(brand, cost, model);
	super.brand = brand;
	super.cost = cost;
	super.model = model;
	this.tyreName = tyreName;
	this.tyreCost = tyreCost;
	this.tyreType = tyreType;
	}
}

class User
{
	public static void main (String[] args) {
		Tyres t = new Tyres("Mahindra", 1650000, 2022, "MRF", 3000, "Tube Less");
		System.out.println(t.brand+ " "+t.cost+ " "+t.model+ " "+t.tyreName+ " "+t.tyreCost+ " "+t.tyreType);
	}
}