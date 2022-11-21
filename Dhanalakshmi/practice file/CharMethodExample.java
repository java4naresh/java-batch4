import java.util.Arrays;


class CharMethodExample
{
  public CharMethodExample() {
  System.out.println("Constructor");
  }
  
  // method creation
   public char[] charArray(char[] characters) {

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
    
    return characters;

   }

   public static void main(String[] args)
   {

   CharMethodExample ch = new CharMethodExample();

   char[] charArray = ch.charArray(new char[]{'d','c','a','e','b','g'});//a,b,c,d,e,g
   System.out.println(Arrays.toString(charArray));
   
   }

}