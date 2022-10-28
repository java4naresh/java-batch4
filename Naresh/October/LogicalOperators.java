class LogicalOperators 
{
	public static void main(String[] args) 
	{
		int marks = 105;
 
         // -5 > 0 && -5 < 35
        if(marks > 0 && marks < 35) {
		System.out.println("Fail");
		} else if(marks > 35 && marks < 51) {
		System.out.println("Third Class");
		} else if(marks > 50 && marks < 61) {
		System.out.println("Second Class");
		} else if(marks > 60 && marks < 71) {
		System.out.println("First Class");
		} else if(marks > 70 && marks < 101) {
		System.out.println("Distinction");
		} else {
		System.out.println("Invalid Marks");
		}
	}
}
