class WhileLoopExample 
{
   public static void main(String[] args) 
   {
     // print 1 to 10 using while loop
      /*int i = 1;
      while(i<=10) {
      System.out.println(i++);
      }*/	 
       
      int num = 858;
      int temp = num;
      int rev = 0;//5
      while(num !=0){
      int rem = num % 10;
      num = num / 10;
      rev = (rev*10) + rem;
      }
   
      System.out.println(temp);
      System.out.println(rev);
      if(temp == rev) {
      System.out.println("Polindrome");
      } else {
      System.out.println("Not Polindrome");
      }    
    }
}