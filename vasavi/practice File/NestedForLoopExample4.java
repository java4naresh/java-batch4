class NestedForLoopExample4
{
	public static void main(String[] args) 
	{
		/*for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i)
		     System.out.print(j+" ");  //1 12 123 1234 12345
		}
         System.out.println();
		}*/


         /* for(int i=5; i>=1; i--) {                //12345 1234 123 12 1
		for(int j=1; j<=i; j++) {
		     System.out.print(j+" ");
		} 
            System.out.println();
		}*/
            
              /*  for(int i=1; i<=5; i++) {
		for(int j=5; j>=1; j--) {
			if(i<j) System.out.print(" "); 
			else System.out.print(j+""); // 1  21 321 4321 54321
		}               
        System.out.println();
		}*/


            for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<i) System.out.print(" ");  // 12345 2345  345 45 5
			else System.out.print(j+"");
		}
        System.out.println();
		}

      }
}
