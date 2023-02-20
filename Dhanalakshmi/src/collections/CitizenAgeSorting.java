package collections;

import java.util.Comparator;

public class CitizenAgeSorting implements Comparator<Citizen>{

	@Override
	public int compare(Citizen o1, Citizen o2) {
		
		return o1.getAge() - o2.getAge();
	}
	

}
