import java.util.Arrays;
class UniqueNumbers 
{
	public static void main(String[] args) 
	{
		int numbers[] = {1,2,3,4,5,6,3,2,1};
		int[] uniqueNumbers = null;

        for(int i = 0; i < numbers.length; i++) {
		int count = 0;
		for(int j = 0; j < numbers.length; j++) {
		if(numbers[i] == numbers[j]) {
		  count++;
		}
		}
        
		if(count == 1) {
		if(uniqueNumbers == null) {
		uniqueNumbers = new int[1];
		uniqueNumbers[0] = numbers[i];
		} else {
			int temp[] = uniqueNumbers;

            uniqueNumbers = new int[uniqueNumbers.length + 1];

			for(int k = 0; k < temp.length; k++) {
			uniqueNumbers[k] = temp[k];
			}
            uniqueNumbers[uniqueNumbers.length - 1] = numbers[i];
		}	
		}
		}
		
		System.out.println(Arrays.toString(uniqueNumbers));
	}
}
