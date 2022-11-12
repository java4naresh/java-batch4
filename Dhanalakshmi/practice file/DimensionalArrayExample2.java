import java.util.Arrays;


class DimensionalArrayExample2
{
  public static void main(String[] args)
  {
    int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(numbers[1][1]);
    System.out.println(numbers[2][0]);
    System.out.println(numbers[2][2]);
    System.out.println(Arrays.toString(numbers[0]));
    System.out.println(Arrays.toString(numbers[1]));
    System.out.println(Arrays.toString(numbers[2]));

    for(int i=0; i < numbers.length; i++) {
    for(int j=2; j < numbers[i].length; j++){
    if(j == numbers[i].length - 1){
    int temp = numbers[0][i];
    numbers[0][i] = numbers[j][i];
    numbers[j][i] = temp;

    }
    }
    }
    System.out.println("============================");
    System.out.println(Arrays.toString(numbers[0]));
    System.out.println(Arrays.toString(numbers[1]));
    System.out.println(Arrays.toString(numbers[2]));


  }

}