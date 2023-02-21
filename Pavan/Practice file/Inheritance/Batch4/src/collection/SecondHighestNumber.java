package collection;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] numbers = { 25, 20, 45, 89, 95, 55 };

		int firstHighestNumber = 0;
		int secondHighestNumber = 0;
		int thierdHighestNumber = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (firstHighestNumber < numbers[i]) {
				secondHighestNumber = firstHighestNumber;
				thierdHighestNumber = secondHighestNumber;
				firstHighestNumber = numbers[i];
			}

			if (firstHighestNumber > numbers[i] && secondHighestNumber < numbers[i])
				secondHighestNumber = numbers[i];
			if (secondHighestNumber < numbers[i] && thierdHighestNumber < numbers[i]) {
				thierdHighestNumber = numbers[i];
			}
				

		}
		
		
		System.out.println(secondHighestNumber);
		System.out.println(firstHighestNumber);
		System.out.println(thierdHighestNumber);

	}

}
