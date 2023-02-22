package collections;

public class ThirdHighestNumberFromArray {

	public static void main(String[] args) {
     int[] numbers = {90,70,100,25,60,65};
     
        int firstHighestNumber = 0;
		int secondHighestNumber = 0;
		int thirdHighestNumber = 0;
			
       for(int i=0; i<numbers.length;i++) {
			
			if(firstHighestNumber < numbers[i]) {
				thirdHighestNumber = secondHighestNumber;
				secondHighestNumber = firstHighestNumber;
				firstHighestNumber = numbers[i];
			} else if (secondHighestNumber < numbers[i]) {
				thirdHighestNumber = secondHighestNumber;
				secondHighestNumber = numbers[i];			
			} else if (thirdHighestNumber < numbers[i]) {
				thirdHighestNumber = numbers[i];
			}
    }
			
		//System.out.println(secondHighestNumber);
		//System.out.println(firstHighestNumber);
      System.out.println(thirdHighestNumber);
	 
     /*int first = Integer.MIN_VALUE;
     int second = Integer.MIN_VALUE;
     int third = Integer.MIN_VALUE;
     
     for(int i=0; i<numbers.length; i++) {
    	    if(numbers[i] > first) {
    	        third = second;
    	        second = first;
    	        first = numbers[i];
    	    } else if (numbers[i] > second) {
    	        third = second;
    	        second = numbers[i];
    	    } else if (numbers[i] > third) {
    	        third = numbers[i];
    	    }
    	}
     
       //System.out.println("The first highest number in the array is: " + first);
    	//System.out.println("The second highest number in the array is: " + second);
    	System.out.println("The third highest number in the array is: " + third);*/

	}

}
