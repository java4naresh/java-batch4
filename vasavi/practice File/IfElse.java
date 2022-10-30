class IfElse {
public static void main(String[] args) {
       int num = 6;
		if(num % 2 == 0) {
		System.out.println("Even");
		} else {
		System.out.println("Odd");
		}

		int marks = 35;
		if(marks < 35) {
		System.out.println("Failed");
		} else {
		System.out.println("Passed");
		}

		int date = 27;

		if(date == 27) {
		System.out.println("Valid");
		} else {
		System.out.println("Invalid");
		}

        // find out given year is leap year or not
		int year = 2021;//2020%4 == 0
		
		if(year % 4 == 0) {
		System.out.println(year+ " is Leap Year");
		} else {
		System.out.println(year + " is Non Leap Year");
		}

	}
}
