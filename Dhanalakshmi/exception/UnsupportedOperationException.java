package exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  UnsupportedOperationException {

	public static void main(String[] args) {
		String[] membersArray = {"One","Two","Three"};
		List<String> membersList = Arrays.asList(membersArray);
		membersList.add("Four");

	}

}
