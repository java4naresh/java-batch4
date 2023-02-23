package collection;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[] numbers = { 115, 245, 78, 97, 103, 95, 96 };

		int firstHighestNumber = 0;
		int secondHighestNumber = 0;
		int thierdHighestNumber = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (firstHighestNumber < numbers[i]) {
				thierdHighestNumber = secondHighestNumber;
				secondHighestNumber = firstHighestNumber;
				firstHighestNumber = numbers[i];
			}

			else if (secondHighestNumber < numbers[i]) {
				thierdHighestNumber = secondHighestNumber;
				secondHighestNumber = numbers[i];
			} else if (thierdHighestNumber < numbers[i]) {
				thierdHighestNumber = numbers[i];
			}

		}

		System.out.println(firstHighestNumber);
		System.out.println(secondHighestNumber);
		System.out.println(thierdHighestNumber);

	}

}
