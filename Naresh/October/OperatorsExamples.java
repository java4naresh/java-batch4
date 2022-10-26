class OperatorsExamples 
{
	public static void main(String[] args) 
	{
		
      String name = "Naresh";//assignment operator
	  int num1 = 10;
	  int num2 = 20;
	  boolean equal = num1 == num2; //(== equality operator)
	  System.out.println(equal);//false
      boolean equal2 = num1 != num2;//(!= equality operator)
	  System.out.println(equal2);//true
	  System.out.println(num1);//10
	  //num1++;
	  //System.out.println(num1);
	  //System.out.println(num1);
      System.out.println(++num1 + num1++ + ++num1);//35 11 + 11 + 13
      System.out.println(num1);//13
	  //post decrement
	  
      //System.out.println(num2--);//20
      //System.out.println(num2);//19
	                    // 14   + 14  +  16  +  15  + 15
      System.out.println(++num1 + num1++ + ++num1 + --num1 + num1--);//74
      System.out.println(num1);// 14
                       // 15    + 15   + 17   + 16 +  16 - 14 - 14 + 19
      System.out.println(++num1 + num1++ + ++num1 + --num1 + num1-- - --num1 - num1++ + --num2);//70
      System.out.println(num1);//?15
	  System.out.println(num2);//?19
	}
}
