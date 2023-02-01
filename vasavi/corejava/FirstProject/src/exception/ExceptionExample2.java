package exception;

public class ExceptionExample2 {
	public static void main(String[] args) {
		Sorting();
	}
	
	public static void Sorting()
	{
		
	 try{	 
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

}
}
	 catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
}
}