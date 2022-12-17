package stringMethods;

public class IndexOfExample {
	public static void main(String[] args) {
		String s = new String ("This is Pavan");
		int i = s.indexOf('i');
		System.out.println(i);
		System.out.println("---------");
		String s1 = new String ("This is Gnana Vikas");
		int i1 = s1.indexOf('s', 7);
		System.out.println(i1);
		System.out.println("---------");
		String s2 = new String ("This is Pardhu");
		int i2 = s2.indexOf("is", 3);
		System.out.println(i2);
	}
}
