package collections;

public class SecondHighestNumberFromArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {800,200,250,100,300,600};
		
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

	
	}
}
	
	   

