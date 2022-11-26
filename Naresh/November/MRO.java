class MRO 
{
	public static void main(String[] args) 
	{
		Child1 c1 = new Child1();
		System.out.println("Sur Name: "+c1.getSurName());
		System.out.println("Village: "+c1.getVillageName());
		System.out.println("Qualification: "+c1.getQualification());

		Child2 c2 = new Child2();
		System.out.println("Sur Name: "+c2.getSurName());
		System.out.println("Village: "+c2.getVillageName());
		System.out.println("Qualification: "+c2.getQualification());
	}
}
