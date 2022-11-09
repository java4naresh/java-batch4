class SortingExample 
{
	public static void main(String[] args) 
	{
		int numbers[] = {5,25,6,20,0,-1,7};//{-1,0,5,6,7,20,25}
        for(int i=0; i<numbers.length;i++) {
		System.out.print(numbers[i]+",");
		}
        System.out.println();
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
		System.out.println("minimum="+ numbers[0]);
		System.out.println("maximum="+ numbers[numbers.length - 1]);

		for(int i=0; i<numbers.length;i++) {
		System.out.print(numbers[i]+",");
		}

	}
}
