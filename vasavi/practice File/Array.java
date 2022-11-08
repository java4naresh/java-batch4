class Array
{
	public static void main(String[] args) 
	{
		// we can create array 2 ways
		// first way
		/*int[] numbers = {10,20,30,40,50};
		System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//40
		System.out.println(numbers[4]);//50
		numbers[0] = 60;
		System.out.println(numbers[0]);//60
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//40
		System.out.println(numbers[4]);//50*/

		//second way
		int[] numbers = new int[5];
		/*System.out.println(numbers[0]);//0
		System.out.println(numbers[1]);//0
		System.out.println(numbers[2]);//0
		System.out.println(numbers[3]);//0
		System.out.println(numbers[4]);//0*/
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		/*System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//40
		System.out.println(numbers[4]);//50*/

		//System.out.println(numbers[6]);//error
		numbers[3] = 70;
		/*System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//70
		System.out.println(numbers[4]);//50*/
		numbers[3] = 140;

		System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);//20
		System.out.println(numbers[2]);//30
		System.out.println(numbers[3]);//140
		System.out.println(numbers[4]);//50
		//System.out.println(numbers[5]);//error

		for(int i=0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}

	}
}
