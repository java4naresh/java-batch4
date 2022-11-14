class College
{ 
  String collegeName;
  String campusName;
  int studentstotal;
  String principalName;
  int totalstaff;


  public static void main(String[] args)
  {
     College college = new College();
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


  }

}