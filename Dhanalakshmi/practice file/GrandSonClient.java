class GrandSonClient
{
  public static void main(String[] args)
  {
    GrandSon gs = new GrandSon();
    System.out.println(gs.grandsonProperty());
    System.out.println(gs.sonProperty());
    System.out.println(gs.fatherProperty());
 
    Son s = new Son();
    System.out.println(gs.sonProperty());
    System.out.println(gs.fatherProperty());
 
    Father f = new Father();
    System.out.println(gs.fatherProperty());

  }

}