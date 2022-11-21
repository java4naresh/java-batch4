import java.util.Arrays;

class Dimensional
{
	public int[][] dim(int[][] numbers) 
	{
		//int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(numbers[1][1]);
		//System.out.println(numbers[2][0]);
		//System.out.println(numbers[2][2]);
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));

		for(int i=0; i < numbers.length; i++) {
		for(int j=0; j < numbers[i].length; j++) {//numbers[0]
		if(j == numbers[i].length - 1) {
		int temp = numbers[i][j];
              numbers[i][j] = numbers[i][0];
		numbers[i][0] = temp;
		}
		}
		}
              /*System.out.println("============================");
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println(Arrays.toString(numbers[2]));*/  
          return numbers;    
	}
    public static void main(String[] args)
    {
     Dimensional method = new Dimensional();
     int[][] dim= method.dim(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
     System.out.println(Arrays.toString(dim));
             
    }
}
  
