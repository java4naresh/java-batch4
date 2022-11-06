class WhileLoopExample 
{
	public static void main(String[] args) 
	{
		// print 1 to 5 using while loop
		/*int i = 1;
		while(i<=5) {
		System.out.println(i++);
		}*/

		int num = 767;
		int temp = num;
        int rev = 0;//5 
		while(num != 0) {
		int rem = num % 10;//5 6 3
        num = num / 10;//36 3 0 
		rev = (rev * 10) + rem;//5 56 563
		}

        System.out.println(temp);
        System.out.println(rev);
		if(temp == rev) {
		System.out.println("Polindrome");
		} else {
		System.out.println("Not Polindrome");
		}
	}
}
