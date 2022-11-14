class Office
{ 
  String officeName;
  String employeesName;
  int employeestotal;
  int employeesid;
  int totalstaff;
  String managerName;
  public static void main(String[] args)
  {
     Office office = new Office();
     System.out.println(office.officeName+" "+office.employeesName+" "+ office.employeestotal+" "+office.employeesid+" "+office.totalstaff+" "+office.managerName); 
     office.officeName = "TCS";
     office.employeesName = "Dhanu";
     office.employeestotal =  1000;
     office.employeesid = 1234;
     office.totalstaff = 500;
     office.managerName = "Dhanu";
     System.out.println(office.officeName+" "+office.employeesName+" "+ office.employeestotal+" "+office.employeesid+" "+office.totalstaff+" "+office.managerName); 

    

  }

}