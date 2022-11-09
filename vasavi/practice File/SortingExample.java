class SortingExample 
{
	public static void main(String[] args) 
	{
             float numbers[] = {5.50f,25.32f,6.67f,20.90f,0.00f,1.78f,7.23f};//{0.0,1.78,5.5,6.67,7.23,20.9,25.32,}
        for(int i=0; i<numbers.length;i++) {  //5.5,25.32,6.67,20.9,0.0,1.78,7.23,
		System.out.print(numbers[i]+",");
		}
        System.out.println();
		// sorting logic
		for(int i=0; i<numbers.length; i++) {//0 0<5.50f

		for(int j=i+1; j<numbers.length; j++) {//1 1<5.50f

		if(numbers[i] > numbers[j]) {//numbers[0] > numbers[1] 5.0 > 25.32
		float temp = numbers[i]; 
		numbers[i] = numbers[j];
		numbers[j] = temp;
		
		}
		
		}
		}
		System.out.println("minimum="+ numbers[0]); //0.0
		System.out.println("maximum="+ numbers[numbers.length - 1]); //25.32

		for(int i=0; i<numbers.length;i++) {
		System.out.print(numbers[i]+","); //0.0,1.78,5.5,6.67,7.23,20.9,25.32



		/*int numbers[] = {5,25,6,20,0,-1,7};//{-1,0,5,6,7,20,25}
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
		System.out.print(numbers[i]+",");*/
		}

	}
}
