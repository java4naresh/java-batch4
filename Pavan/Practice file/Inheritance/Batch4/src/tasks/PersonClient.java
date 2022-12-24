package tasks;

public class PersonClient {

	public static void main(String[] args) {
		PersonInfo info = new PersonInfo(1, "Pavan", 30, "123456789");
		PersonInfo info1 = new PersonInfo(2, "Pardhu", 3, "12300000");
		PersonInfo info2 = new PersonInfo(3, "Vikky", 1, "0000000");
		PersonInfo info3 = new PersonInfo (4, "Triveni", 23, "3210000");
		PersonInfo[] persons = {info, info1, info2, info3};
		for (int i=0; i<persons.length; i++) {
			PersonInfo personInfo = persons[i];
			if(personInfo.getAge() >20) {
				System.out.println(personInfo);

	}

}
}
}