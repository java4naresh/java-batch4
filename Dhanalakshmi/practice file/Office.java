class Office
{ 
  String officeName;
  String employeesName;
  int employeesid;
  int totalstaff;
  String managerName;

  public Office() { // default constructor or no param constructor
  System.out.println("no param constructor");
 
  }

  public Office(String name, String employName,int id, int staff, String mngrName) { //param constructor
  officeName = name;
  employeesName = employName;
  employeesid = id;
  totalstaff = staff;
  managerName = mngrName;
  }
  
  public Office(String name, String employName,int id,String mngrName){
  officeName = name;
  employeesName = employName;
  employeesid = id;
  managerName = mngrName;
  
  }


  public static void main(String[] args)
  {
     Office office = new Office();//no param constructor
     System.out.println(office.officeName+" "+office.employeesName+" "+office.employeesid+" "+office.totalstaff+" "+office.managerName); 
     office.officeName = "TCS";
     office.employeesName = "Dhanu";
     office.employeesid = 1234;
     office.totalstaff = 500;
     office.managerName = "Dhanu";
     System.out.println(office.officeName+" "+office.employeesName+" "+office.employeesid+" "+office.totalstaff+" "+office.managerName); 
          
     Office office2 = new Office("TECHMAHINDRA","Dhanu",123,1000,"Charanya");//param constructor
     System.out.println(office2.officeName+" "+office2.employeesName+" "+office2.employeesid+" "+office2.totalstaff+" "+office2.managerName);

     Office office3 = new Office("Wipro","charanya",1234,"Varsha");//param constructor
     System.out.println(office3.officeName+" "+office3.employeesName+" "+office3.employeesid+" "+office3.managerName);

  }

}