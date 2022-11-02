class ForLoopExample 
{
	public static void main(String[] args) 
	{
	  for(int i=1; i <= 10; i++) {
	  System.out.println(i);
	  }
      System.out.println("==========================");
	  for(int i=10; i >= 1; i--) {//10 <= 10, 9 <= 10 ..... 0 <= 10, 0 >= 1
	  System.out.println(i);//10,9
	  }
      System.out.println("==========================");
	  for(int i=1; i <= 10; i++) {
	  System.out.println("5*"+i+"="+(5*i));//5*2=10
	  }
	  /*System.out.println("==========================");
	  for(int i=1; i <= 100; i++) {
		  if(i % 2 == 0) {//1 odd 2 % 2 == 0
		  System.out.println("Even="+i);
		  } else {
          System.out.println("Odd="+i);
		  }
	  }*/

	   System.out.println("==========================");
	   for(int i=1; i <= 100; i = i+2) {
		  System.out.println("Odd="+i);
	    }

       System.out.println("==========================");
	   for(int i=100; i <= 200; i++) {
		  System.out.println(i);
	    }

	}
}
