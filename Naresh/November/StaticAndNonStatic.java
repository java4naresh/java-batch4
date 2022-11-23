class StaticAndNonStatic 
{
	static int num1;
	int num2;
   static {
   System.out.println("Static Block");
   } 

	{
	System.out.println("Non Static Block");
	}

   public StaticAndNonStatic() {
   System.out.println("Constructor");
   }

	public static void main(String[] args) 
	{
        StaticAndNonStatic.num1 = 10;
        System.out.println("Main Method");
		StaticAndNonStatic sas = new StaticAndNonStatic();
        sas.num2 = 20;
        System.out.println(sas.num1+" "+sas.num2);//10 20
		StaticAndNonStatic sas2 = new StaticAndNonStatic();
		System.out.println(sas2.num1+" "+sas2.num2);//10 0
		StaticAndNonStatic sas3 = new StaticAndNonStatic();
		System.out.println(sas3.num1+" "+sas3.num2);//10 0
	}
}
