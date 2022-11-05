class NestedForLoopExample2 
{
	public static void main(String[] args) 
	{
		/*for(int i=1; i<=5; i++) {
		for(int j=1; j<=5; j++) {
			if(j<=i)
		     System.out.print("*");
		}
        System.out.println();
		}*/

		/*for(int i=1; i<=5; i++) {//1 2
		for(int j=1; j<=i; j++) {//1 1<=2 2<=2 3<=2
		     System.out.print("*");
		}
        System.out.println();
		}*/

		/*for(int i=5; i>=1; i--) {//5 5>=1 4>=1
		for(int j=1; j<=i; j++) {//1 1<=5 2<=5 3<=5 4<=5 5<=5 6<=5 1<=4 2<=4 3<=4 4<=4 5<=4
		     System.out.print("*");
		}
        System.out.println();
		}*/

       /*for(int i=1; i<=5; i++) {//1 1<=5 2<=5
		for(int j=5; j>=1; j--) {//5 5>=1
			if(i<j) System.out.print(" "); // 1<5 2<5 3<5 4<5 5<5 2<5 3<5 4<5 5<5
			else System.out.print("*");
		}
        System.out.println();
		}*/

		for(int i=1; i<=5; i++) {//
		for(int j=1; j<=5; j++) {//
			if(j<i) System.out.print(" "); // 1 < 2 2 < 2
			else System.out.print("*");
		}
        System.out.println();
		}


	}
}
