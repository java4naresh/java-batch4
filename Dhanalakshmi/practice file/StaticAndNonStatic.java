class StaticAndNonStatic
{
  static int num1;
  int num2;
  int num3;
  int num4;
  int num5;
 
  
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
     StaticAndNonStatic.num1 = 20;
     System.out.println("Main Method");
     StaticAndNonStatic sas = new StaticAndNonStatic();
     sas.num2 = 30;
     System.out.println(sas.num1+" "+sas.num2);//20 30
     StaticAndNonStatic sas2 = new StaticAndNonStatic();
     System.out.println(sas2.num1+" "+sas2.num2);//20 0
     StaticAndNonStatic sas3 = new StaticAndNonStatic();
     System.out.println(sas3.num1+" "+sas3.num2);//20 0
     sas.num3 = 40;
     System.out.println(sas.num1+" "+sas.num2+" "+sas.num3);//20 30 40
     StaticAndNonStatic sas4 = new StaticAndNonStatic();
     System.out.println(sas4.num1+" "+sas4.num2+" "+sas4.num3);//20 0 0
     sas.num4 = 50;
     System.out.println(sas.num1+" "+sas.num2+" "+sas.num3+" "+sas.num4);//20 30 40 50
     StaticAndNonStatic sas5 = new StaticAndNonStatic();
     System.out.println(sas5.num1+" "+sas5.num2+" "+sas5.num3+" "+sas5.num4);//20 0 0 0
     StaticAndNonStatic sas6 = new StaticAndNonStatic();
     System.out.println(sas6.num1+" "+sas6.num2+" "+sas6.num3+" "+sas6.num4);//20 0 0 0
     sas.num5 = 70;
     System.out.println(sas.num1+" "+sas.num2+" "+sas.num3+" "+sas.num4+" "+sas.num5);//20 30 40 50 70
     StaticAndNonStatic sas7 = new StaticAndNonStatic();
     System.out.println(sas7.num1+" "+sas7.num2+" "+sas7.num3+" "+sas7.num4+" "+sas7.num5);//20 0 0 0 0

   }

}