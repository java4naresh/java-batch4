package tasks;

public class TaskClient {

	public static void main(String[] args) {
		
    PersonInfo info = new PersonInfo(1,"Charanya",2);
    PersonInfo info2 = new PersonInfo(2,"Mahira",1);
    PersonInfo info3 = new PersonInfo(3,"Varsha",25);
    PersonInfo info4 = new PersonInfo(4,"Ramana",32);
    PersonInfo[] person = {info,info2,info3,info4};
    
    for(int i=0; i < person.length; i++) {
    	PersonInfo personInfo = person[i];
    	if(personInfo.getAge()> 20) {
    		System.out.println(personInfo);
    	}
      }
	}

}
