class College
{ 
  String collegeName;
  String campusName;
  int studentstotal;
  String principalName;
  int totalstaff;


  public College() { // default constructor or no param constructor
   System.out.println("no param constructor");
  
  }

  public College(String name, String campName,int students, String princiName, int staff) { //param constructor
  collegeName = name;
  campusName = campName;
  studentstotal = students;
  principalName = princiName;
  totalstaff = staff;
  }
 
  public College(String name, String campName,int students, String princiName) {
  collegeName = name;
  campusName = campName;
  studentstotal = students;
  principalName = princiName;
  
  }
   


  public static void main(String[] args)
  {
     College college = new College();//no param constructor
     System.out.println(college.collegeName+" "+ college.campusName+" "+ college.studentstotal+" "+college.principalName+" "+college.totalstaff); 
     college.collegeName = "ANU";
     college.campusName = "saraswathi";
     college.studentstotal =  1000;
     college.principalName = "Dhanu";
     college.totalstaff = 50;
     System.out.println(college.collegeName+" "+ college.campusName+" "+ college.studentstotal+" "+college.principalName+" "+college.totalstaff);
 
     College college2 = new College();
     System.out.println(college2.collegeName+" "+ college2.campusName+" "+ college2.studentstotal+" "+college2.principalName+" "+college2.totalstaff); 
     college2.collegeName = "Oxford";
     college2.campusName = "Girls";
     college2.studentstotal =  2500;
     college2.principalName = "Dhana";
     college2.totalstaff = 30;
     System.out.println(college2.collegeName+" "+ college2.campusName+" "+ college2.studentstotal+" "+college2.principalName+" "+college2.totalstaff); 
     
     College college3 = new College("Narayana","boys",2000,"Charanya", 150);
     System.out.println(college3.collegeName+" "+ college3.campusName+" "+ college3.studentstotal+" "+college3.principalName+" "+college3.totalstaff); 

     College college4 = new College("Chalapathi","boys & girls",5000,"Dhanalakshmi");//param constructor
     System.out.println(college4.collegeName+" "+ college4.campusName+" "+ college4.studentstotal+" "+college4.principalName); 


  }

}