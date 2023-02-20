package collection;

public class SecondHighestNumberFromArray {

	public static void main(String[] args) {
		int[] numbers = {25,20,45,89,95,55};
		
		int firstHighestNumber = 0;
		int secondHighestNumber = 0;
		
		for(int i=0; i<numbers.length;i++) {
			
			if(firstHighestNumber < numbers[i]) {
				secondHighestNumber = firstHighestNumber;
				firstHighestNumber = numbers[i];
			}
			
			if(firstHighestNumber > numbers[i] && secondHighestNumber < numbers[i]) 
				secondHighestNumber = numbers[i];
			
			
		}
		System.out.println(secondHighestNumber);
		System.out.println(firstHighestNumber);

	}

}
