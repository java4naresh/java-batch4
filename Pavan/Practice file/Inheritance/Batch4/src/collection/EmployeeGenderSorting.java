package collection;

import java.util.Comparator;

public class EmployeeGenderSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getGender().compareTo(o2.getGender());
	}

}
