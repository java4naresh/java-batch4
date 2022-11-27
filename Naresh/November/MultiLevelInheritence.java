class GrandParent 
{
	public int grandParentProperty() {
	
	return 25;
	}
}

class Parents extends GrandParent
{
	public int parentProperty() {
		return 10;
	}
}

class Child extends Parents
{
	public String childProperty() {
		return "Job";
	}
}
