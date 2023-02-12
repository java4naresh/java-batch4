package collection;

import java.util.ArrayList;
import java.util.List;

public class SumExample {

	public static int sumOfArray(Integer[] a, int n) {
		if (n == 0)
			return a[n];
		else
			return a[n] + sumOfArray(a, n - 1);
		// return a[n] * sumOfArray(a, n - 1);
		// return a[n] - (sumOfArray(a, n - 1));
		// return a[n] / sumOfArray(a, n - 1);
	}

	public static void main(String[] args) {
		List<Integer> sum = new ArrayList<Integer>();

		sum.add(9);
		sum.add(3);
		// sum.add(3);
		// sum.add(8);
		// sum.add(5);
		// sum.add(7);
		Integer a[] = new Integer[sum.size()];
		sum.toArray(a);
		System.out.print("Elements in List : ");

		for (Integer obj : a) {
			System.out.print(obj + " ");
		}

		int sum1 = sumOfArray(a, a.length - 1);

		System.out.println();

		System.out.println("Sum of elements : " + sum1);
	}
}
