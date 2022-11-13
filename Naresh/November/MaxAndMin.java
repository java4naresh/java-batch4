class MaxAndMin 
{
	public static void main(String[] args) 
	{
		int[] numbers = {0,-2,-3,-11,-8,-9,-20};

		//int maxNumber = Integer.MIN_VALUE;
		//int maxNumber = 0;
        int minNumber = Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
		if(minNumber > numbers[i]) minNumber = numbers[i];
		}
        System.out.println(minNumber);

	}



}