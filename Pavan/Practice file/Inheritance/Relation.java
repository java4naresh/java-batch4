class Mother 
{
	String husbandName;
	String initialName;
	String dob;
	String village;
	
	public Mother(String husbandName, String initialName, String dob, String village) {
	}
}

class Son extends Mother
{
	String name1;
	String dob1;
	int age1;
	String name2;
	String dob2;
	int age2;

	public Son(String husbandName, String initialName, String dob, String village, String name1, String dob1, int age1, String name2, String dob2, int age2) {
		super(husbandName, initialName, dob, village);
		super.husbandName = husbandName;
		super.initialName = initialName;
		super.dob = dob;
		super.village = village;
		this.name1 = name1;
		this.dob1 = dob1;
		this.age1 = age1;
		this.name2 = name2;
		this.dob2 = dob2;
		this.age2 = age2;
	}
}

class Family
{
   public static void main (String[] args) {
	   Son s = new Son("Pavan", "Pallapati", "01-January-1998", "Putlagudem", "Pardhu", "25-July-2020", 3, "Gnana Vikas", "16-January-2022", 1);
	   System.out.println(s.husbandName+" "+s.initialName+" "+s.dob+" "+s.village+" "+s.name1+" "+s.dob1+" "+s.age1+" "+s.name2+" "+s.dob2+" "+s.age2);
   }
}