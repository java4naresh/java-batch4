package collections;

import java.util.Comparator;

public class PersonNameSorting implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getPersonId().compareTo(o2.getCitizenName());
	}

}
