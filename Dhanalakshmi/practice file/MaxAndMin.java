class MaxAndMin
{
  public static void main(String[] args)
  {

     /*int[] numbers = {1,2,4,9,12,13,25};

     int maxNumber = Integer.MIN_VALUE;
     //int maxNumber = 0;
     for(int i = 0; i < numbers.length; i++){
     if(maxNumber < numbers[i]) maxNumber = numbers[i];

    }
    System.out.println(maxNumber);*/


     int[] numbers = {1,2,-3,4,11,9,12,13,25};

     int minNumber = Integer.MAX_VALUE;
     //int minNumber = 0;
     for(int i = 0; i < numbers.length; i++){
     if(minNumber > numbers[i]) minNumber = numbers[i];

    }
    System.out.println(minNumber);



  }
}