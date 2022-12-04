class Super
{ 
   String superName;

   int superAge;

   public Super() {
   System.out.println("Super Constructor");

  }

  public Super(String name,int superAge)
  {
   superName = name;
   this.superAge = superAge;
   //System.out.println("Super Param Constructor");

  }
  public void m1() {


  }
}

class Sub extends Super
{
   String subName;

   int subAge;

  public Sub(String superName,int superAge,String subName,int subAge) 
  {
  // super(superName,superAge);
   super();
   super.superName = superName;
   super.superAge = superAge;
   this.subName = subName;
   this.subAge = subAge;

  // System.out.println("Sub Constructor");

  }
}

class SubAndSuperClient
{
  public static void main(String[] args)
  {
    Sub s = new Sub("Super",10,"Sub",20);
    System.out.println(s.superName+" "+ s.superAge +" "+s.subName+" "+s.subAge);

  }

}