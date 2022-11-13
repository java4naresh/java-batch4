
import java.util.Arrays;
class Uniquenumbers2
{
   public static void main(String[] args)
   {
      /*int numbers[] = {5,6,7,10,9,8,7,6,5};
      int[] uniquenumbers = null;
    
      for(int i = 0; i < numbers.length; i++) {
      int count = 0;
      for(int j = 0; j < numbers.length; j++) {
      if(numbers[i] == numbers[j]){
       count++;
      }
      }
      
      if(count == 1) {
      if(uniquenumbers == null) {
      uniquenumbers = new int[1];
      uniquenumbers[0] = numbers[i];
      } else {
         int temp[] = uniquenumbers;

         uniquenumbers = new int[uniquenumbers.length + 1];
 
         for(int k = 0; k < temp.length; k++) {
         uniquenumbers[k] = temp[k];
         }
       
         uniquenumbers[uniquenumbers.length - 1] = numbers[i];


      }

      }

      }

       System.out.println(Arrays.toString(uniquenumbers));*/


       /*int numbers[] = {3,4,1,5,3,4};
       int[] uniquenumbers = null;

       for(int i = 0; i < numbers.length; i++) {
       int count = 0;
       for(int j = 0; j < numbers.length; j++) {
       if(numbers[i] == numbers[j]) {
       count++;
       }
       }

       if(count == 1) {
       if(uniquenumbers == null) {
       uniquenumbers = new int[1];
       uniquenumbers[0] = numbers[i];
       } else {
         int temp[] = uniquenumbers;

         uniquenumbers = new int[uniquenumbers.length + 1];
         for(int k = 0; k < temp.length; k++) {
         uniquenumbers[k] = temp[k];
         }

         uniquenumbers[uniquenumbers.length - 1] = numbers[i];

       }
       }
       }

       System.out.println(Arrays.toString(uniquenumbers));*/
     
       int numbers[] = {3,4,1,5,3,4,1};
       int[] uniquenumbers = null;

       for(int i = 0; i < numbers.length; i++) {
       int count = 0;
       for(int j = 0; j < numbers.length; j++) {
       if(numbers[i] == numbers[j]) {
       count++;
       }
       }

       if(count == 1) {
       if(uniquenumbers == null) {
       uniquenumbers = new int[1];
       uniquenumbers[0] = numbers[i];
       } else {
         int temp[] = uniquenumbers;

         uniquenumbers = new int[uniquenumbers.length + 1];
        }

        }

        }
       System.out.println(Arrays.toString(uniquenumbers));

   }
}