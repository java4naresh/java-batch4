package collection;

import java.util.Comparator;

public class CitizenNameSorting implements Comparator<Citizen> {

	@Override
	public int compare(Citizen o1, Citizen o2) {
		return o1.getCitizenName().compareTo(o2.getCitizenName());
		
	}
		
}
