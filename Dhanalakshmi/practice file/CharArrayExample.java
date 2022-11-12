import java.util.Arrays;

class CharArrayExample
{
  public static void main(String[] args)
  {
    char[] characters = {'d','c','a','e','b','g'};

    System.out.println(Arrays.toString(characters));

    for(int i=0; i<characters.length; i++) {
    for(int j=i+1; j<characters.length; j++) {

    if(characters[i] > characters[j]) {//numbers[0] > numbers[1]
       //system.out.println((int)characters[i]);
       //system.out.println((int)characters[j]);
    char temp = characters[i];
    characters[i] = characters[j];
    characters[j] = temp;

    }

    }
    }

    System.out.println(Arrays.toString(characters));

  }

}