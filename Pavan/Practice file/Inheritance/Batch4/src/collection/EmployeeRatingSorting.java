package collection;

import java.util.Comparator;

public class EmployeeRatingSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getRating() - o2.getRating();

		/*
		 * if (o1.getRating() < o2.getRating()) return 1;
		 * 
		 * else if (o1.getRating() > o2.getRating()) return -1; else return 0;
		 */

	}

}
