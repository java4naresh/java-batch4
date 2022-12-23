package tasks;

public class TaskClient {

	public static void main(String[] args) {
		
		PersonInfo info = new PersonInfo(1,"Naresh", 10);
		PersonInfo info2 = new PersonInfo(2,"Naresh1", 10);
		PersonInfo info3 = new PersonInfo(3,"Naresh2", 15);
		PersonInfo info4 = new PersonInfo(4,"Naresh3", 15);
		PersonInfo[] persons = {info, info2, info3, info4};
		
		for(int i=0; i < persons.length; i++) {
			PersonInfo personInfo = persons[i];
			if(personInfo.getAge() > 20) {
				System.out.println(personInfo);
			}
		}

	}

}
