import java.util.Arrays;

class MethodExample
{
  public MethodExample() {
  System.out.println("Constructor");
  }

  // method creation
   public int addTwoNumbers(int num1,int num2) {
   System.out.println("addTwoNumbers");
   int sum = num1 + num2;
   return sum;

  }
   public int addThreeNumbers(int num1,int num2,int num3) {
   System.out.println("addThreeNumbers");
   int sum = num1 + num2 + num3;
   return sum;

  }
   public void addThreeNumbersAndPrint(int num1,int num2,int num3) {
   System.out.println("addThreeNumbersAndPrint");
   int sum = num1 + num2 + num3;
   System.out.println("Sum ="+ sum);

   }
  
   public float[] sortArray(float[] amount) {
    for(int i=0;i<amount.length;i++){ //0 0<6

    for(int j=i+1; j<amount.length; j++){ //1 1<6

    if(amount[i] > amount[j]){ //amount[0] > amount[1] 20.1f>11.0f
    float temp = amount[i];// temp = 20.1f;
    amount[i] = amount[j];// {11.0f,11.0f,25.2f,15.4f,22.3f,45.6f}
    amount[j] = temp;// {11.0f,20.1f,25.2f,15.4f,22.3f,45.6f} {15.4f,20.1f,22.3f,25.2f,45.6f,11.0f}
 
    }

    }
    }
    
    return amount;

  
   }


   public static void main(String[] args)
   {

   MethodExample me = new MethodExample();
   int sum = me.addTwoNumbers(15,25);
   System.out.println(sum);
   sum = me.addThreeNumbers(5,10,15);
   System.out.println(sum);
   me.addThreeNumbersAndPrint(5,5,5);
   float[] sortedArray = me.sortArray(new float[]{20.1f,11.0f,25.2f,15.4f,22.3f,45.6f,5.8f,1.0f});//{5.8f,11.0f,15.4f,20.1f,22.3f,25.2f,45.6f,1.0f}
   System.out.println(Arrays.toString(sortedArray));


  }

}