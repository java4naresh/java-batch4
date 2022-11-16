import java.util.Arrays;

class MethodExample 
{

    public MethodExample() {
	System.out.println("Constructor");
	}

	// method creation
	public int addTwoNumbers(int num1, int num2) {
		System.out.println("addTwoNumbers");
	    int sum = num1 + num2;
	    return sum;
	}

	public int addThreeNumbers(int num1, int num2, int num3) {
		System.out.println("addThreeNumbers");
	    int sum = num1 + num2 + num3;
	    return sum;
	}

	public void addThreeNumbersAndPrint(int num1, int num2, int num3) {
		System.out.println("addThreeNumbersAndPrint");
	    int sum = num1 + num2 + num3;
	    System.out.println("Sum ="+ sum);
	
	}

	public int[] sortArray(int[] numbers) {

        
		// sorting logic
		for(int i=0; i<numbers.length; i++) {//0 0<5

		for(int j=i+1; j<numbers.length; j++) {//1 1<5

		if(numbers[i] > numbers[j]) {//numbers[0] > numbers[1] 5 > 2
		int temp = numbers[i]; // temp = 5;
		numbers[i] = numbers[j];// {2,2,6,8,1}
		numbers[j] = temp;//{2,5,6,8,1} {1,5,6,8,2}
		
		}
		
		}
		}
		

		return numbers;
	
	}

	public static void main(String[] args) 
	{
		MethodExample me = new MethodExample();
		int sum = me.addTwoNumbers(10, 20);
        System.out.println(sum);
		sum = me.addThreeNumbers(10, 20, 30);
        System.out.println(sum);
        me.addThreeNumbersAndPrint(10, 20, 30);
		int[] sortedArray = me.sortArray(new int[]{5,25,6,20,0,-1,7});//{-1,0,5,6,7,20,25}
        System.out.println(Arrays.toString(sortedArray));
	}
}
