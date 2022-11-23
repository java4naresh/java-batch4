class Arithmetic
{
  
   public int sum(int num1, int num2) {
   return num1+num2;
   }

   public int sub(int num1, int num2) {
   return num1-num2;
   }

   public int mul(int num1, int num2) {
   return num1*num2;
   }

   public int div(int num1, int num2) {
   return num1/num2; 
   }

   public static void main(String[] args) 
   {
     Client c = new Client();
     System.out.println(c.getInformation());

   }

}