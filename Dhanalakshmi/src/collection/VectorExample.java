package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//Vector<String> vector = new Vector<>(5,5);
		//Vector<String> vector = new Vector<>(5);
	      List<String> namesList = new ArrayList<>();
	      namesList.add("Mahira");//0
	      namesList.add("Hema");//1
	      namesList.add("Vinnila");//2
	      namesList.add("Kavitha");//3
	      namesList.add("Vijji");//4
	      namesList.add("Ramana");//5
	      namesList.add("Varsha");//6
	      System.out.println(namesList);
	      namesList.replaceAll(String:: toUpperCase);
			System.out.println(namesList);
	      Vector<String> vector = new Vector<>(namesList);
        System.out.println(vector.add("Dhana"));//0 true
        vector.add("Pawan");//1
        vector.add("Vamsi");//2
        vector.add("Vasavi");//3
        System.out.println(vector);
        vector.add(4, "Naresh");
        System.out.println(vector);
	}

}
