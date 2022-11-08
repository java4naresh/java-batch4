class ArraysExample
{
  public static void main(String[] args)
  {
    // Arrays 2 ways
    // first way
      /*int[] numbers = {20,30,40,50,60,80,90};
      System.out.println(numbers[0]);//20
      System.out.println(numbers[1]);//30
      System.out.println(numbers[2]);//40
      System.out.println(numbers[3]);//50 
      System.out.println(numbers[4]);//60 
      System.out.println(numbers[5]);//80
      System.out.println(numbers[6]);//90
 
      numbers[2]=100;
      System.out.println(numbers[0]);//20
      System.out.println(numbers[1]);//30
      System.out.println(numbers[2]);//100
      System.out.println(numbers[3]);//50 
      System.out.println(numbers[4]);//60 
      System.out.println(numbers[5]);//80
      System.out.println(numbers[6]);//90*/

      //second way
      int[] numbers = new int[4];
     /* System.out.println(numbers[0]);//0
      System.out.println(numbers[1]);//0
      System.out.println(numbers[2]);//0
      System.out.println(numbers[3]);//0 
      numbers[0] = 5;
      numbers[1] = 10;
      numbers[2] = 55;
      numbers[3] = 25;
      /*System.out.println(numbers[0]);//5
      System.out.println(numbers[1]);//10
      System.out.println(numbers[2]);//55
      System.out.println(numbers[3]);//25*/

      //System.out.println(numbers[7]);//error 
      numbers[0] = 2419;
      /*System.out.println(numbers[0]);//2419
      System.out.println(numbers[1]);//10
      System.out.println(numbers[2]);//77
      System.out.println(numbers[3]);//25*/

      numbers[3] = 19;
      /*System.out.println(numbers[0]);//2419
      System.out.println(numbers[1]);//10
      System.out.println(numbers[2]);//77
      System.out.println(numbers[3]);//19
      System.out.println(numbers[4]);//error*/

      for(int i=0; i< numbers.length;i++) {
      System.out.println(numbers[i]);
      }

  }

}