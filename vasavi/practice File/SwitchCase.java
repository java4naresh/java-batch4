class SwitchCase {
	public static void main(String[] args) 
	{
		switch(0) {
		case 1: System.out.println("One"); break;
		case 2: System.out.println("Two"); break;
		case 3: System.out.println("Three"); break;
		case 4: System.out.println("Four"); break;
		case 5: System.out.println("Five"); break;
		case 6: System.out.println("Six"); break;
		case 7: System.out.println("Seven"); break;
		case 8: System.out.println("Eight"); break;
		case 9: System.out.println("Nine"); break;
		case 0: System.out.println("Zero"); break;
		default : System.out.println("Invalid Number"); 
		}

        switch("two") {
		case "One": System.out.println(1); break;
		case "Two": System.out.println(2); break;
		case "Three": System.out.println(3); break;
		case "Four": System.out.println(4); break;
		case "Five": System.out.println(5); break;
		case "Six": System.out.println(6); break;
		case "Seven": System.out.println(7); break;
		case "Eight": System.out.println(8); break;
		case "Nine": System.out.println(9); break;
		case "Zero": System.out.println(0); break;
		default : System.out.println("Invalid Number"); 
		}

		switch('e') {
		case 'a' : System.out.println("Owel"); break;
		case 'e' : System.out.println("Owel"); break;
		case 'i' : System.out.println("Owel"); break;
		case 'o' : System.out.println("Owel"); break;
		case 'u' : System.out.println("Owel"); break;
		default : System.out.println("Not Owel"); break;
		
		}

 }
}