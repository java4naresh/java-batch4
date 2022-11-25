class StaticandNonstatic 
{
	static int n2;
	int n1;
   static {
   System.out.println("Static Block");
   System.out.println("a");
   } 
	{
	System.out.println("Non Static Block");
        System.out.println("b");
	}

   public StaticandNonstatic() {
   System.out.println("Constructor");
   }

	public static void main(String[] args) 
	{
        StaticandNonstatic.n2 = 30;
        System.out.println("Main Method");
		StaticandNonstatic sn = new StaticandNonstatic();
        sn.n1 = 40;
        System.out.println(sn.n2+" "+sn.n1);//30 40
		StaticandNonstatic sn2 = new StaticandNonstatic();
		System.out.println(sn2.n2+" "+sn2.n1);// 40 0
		StaticandNonstatic sn3 = new StaticandNonstatic();
		System.out.println(sn3.n2+" "+sn3.n1);//40 0
	}
}
