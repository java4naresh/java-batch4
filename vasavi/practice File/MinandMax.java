class MinandMax{
   public int MM(int[] numbers){  

     int maxNumber = Integer.MIN_VALUE;
     //int maxNumber = 0;
     for(int i = 0; i < numbers.length; i++){
     if(maxNumber < numbers[i]) maxNumber = numbers[i];
    }
   return maxNumber;
  }
 public static void main(String[] args){
      MinandMax me = new MinandMax();
      int MM = me.MM(new int[]{4,6,8,10,12,14});
      System.out.println(MM);
  }
}

  /*public static void main(String[] args){

     int[] numbers = {4,6,8,10,12,14};

     int maxNumber = Integer.MIN_VALUE;
     //int maxNumber = 0;
     for(int i = 0; i < numbers.length; i++){
     if(maxNumber < numbers[i]) maxNumber = numbers[i];

    }
    System.out.println(maxNumber);*/


     /*int[] numbers = {13,-14,-18,-1,15};

     int minNumber = Integer.MAX_VALUE;
     //int minNumber = 0;
     for(int i = 0; i < numbers.length; i++){
     if(minNumber > numbers[i]) minNumber = numbers[i];

    }
    System.out.println(minNumber);

  }
}*/