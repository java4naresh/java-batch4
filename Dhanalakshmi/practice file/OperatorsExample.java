class OperatorsExample {

 public static void main(String[] args){
 
  
  String name = "Dhana";//assignment operator
  int num1 = 10;
  int num2 = 20;
  boolean equal = 10 == 10;//(==equality operator)
  System.out.println(equal);//true
  boolean equal1 = 10 == 20;
  System.out.println(equal1);//false
  boolean equal2 = 10==20;
  System.out.println(equal2);//false
  boolean equal3 = 10 !=20;
  System.out.println(equal3);//true
  boolean equal4 = num1==num2;//(==equality operator)
  System.out.println(equal4);//false
  System.out.println(num1);//10
  //num1++;
  //System.out.println(num1);
  //System.out.println(num1);

  //System.out.println(++num1 + num1++);//22
  //System.out.println(num1);//12

  //System.out.println(++num1 + num1++ + ++num1);//35 11+11+13
  //System.out.println(num1);//13

  //System.out.println(++num1 + num1++ + ++num1 + num1++);//48 11+11+13+13
  //System.out.println(num1);//14

   //System.out.println(++num2 + num2++);//42 21+21
   //System.out.println(num2);//22

   //System.out.println(++num2 + num2++ + ++num2);//65 21+21+23
   //System.out.println(num2);//23

   System.out.println(++num2 + num2++ + ++num2 + num2++);//88 21+21+23+23
   System.out.println(num2);//24


  }

} 