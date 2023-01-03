package Task;

public class EmployeeMain {
	

	public static void main(String[] args) {
		
		EmployeeInformation person1 = new EmployeeInformation(101, "Kambala", "Naresh", "Male",80000, "IT","Hydeabad", 7);
		EmployeeInformation person2 = new EmployeeInformation(102, "veera", "babu", "Male",60000, "IT","Hydeabad", 5);
		EmployeeInformation person3 = new EmployeeInformation(103, "Mannem", "Dhanalakshmi", "Female",30000, "IT","Chennai", 2);
		EmployeeInformation person4 = new EmployeeInformation(104, "perumalla", "Krishnavasavi", "Female",20000, "IT","Chennai", 1);
		EmployeeInformation person5 = new EmployeeInformation(105, "perumalla", "Durga", "Female",50000, "IT","vizag", 4);
		EmployeeInformation person6 = new EmployeeInformation(106, "Goddu", "Sruthi", "Female",23000, "IT","vizag", 1);
		EmployeeInformation person7 = new EmployeeInformation(107, "Sriram", "Susmitha", "Female",25000, "bank","Hyderabad", 1);
		EmployeeInformation person8 = new EmployeeInformation(108, "ponnuru", "lokesh", "male",30000, "Business","Banglore", 2);
		EmployeeInformation person9 = new EmployeeInformation(109, "sri","Ramya", "Female",28000, "Non-IT","vizag", 2);
		
		EmployeeInformation[] persons = {person1, person2, person3, person4, person5, person6, person7, person8, person9};
		for(int i=0; i < persons.length; i++) {
			EmployeeInformation EmployeeInformation  = persons[i];			
			/*if(EmployeeInformation.getSalary() > 30000) {
				System.out.println(EmployeeInformation);
			}*/
			
			/*if(EmployeeInformation.getGender()== "Male") {
				
				System.out.println(EmployeeInformation);
			}*/
			
            /* if(EmployeeInformation.getExperience() > 2) {
				
				System.out.println(EmployeeInformation);
			}*/
			
              if(EmployeeInformation.getCity() == "vizag") {
				
				System.out.println(EmployeeInformation);
            }
							
			}
		
		}
		
}
	

