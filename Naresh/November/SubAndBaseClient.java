class Base 
{
	String superName;

	int superAge;

	public Base() {
		System.out.println("Base Constructor");
	}

	public Base(String name, int superAge) {
        superName = name;
        this.superAge = superAge;
	    //System.out.println("Base Param Constructor");

	}

	public void m1() {
	
	}
}

class Sub extends Base
{
	String subName;

	int subAge;

	public Sub(String superName, int superAge, String subName, int subAge) {
		//super(superName, superAge);
		super();
		super.superName = superName;
		super.superAge = superAge;
        this.subName = subName;
		this.subAge = subAge;
		//System.out.println("Sub Constructor");
	}
}

class SubAndBaseClient
{
	public static void main(String[] args) {
		Sub s = new Sub("Super", 1, "Sub", 2);
	    System.out.println(s.superName+" "+ s.superAge + " "+s.subName+" "+s.subAge);

	}
}
