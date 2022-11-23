class Manager
{
  public static void main(String[] args)
  {

   SbiBank.BankName = "SBI";
   SbiBank.BranchName = "Guntur";
   SbiBank customer1 = new SbiBank();
   System.out.println(customer1.customerAccountnum+" "+customer1.customerName+" "+customer1.customerGender+" "+customer1.BankName+" "+customer1.BranchName);
   customer1.customerAccountnum = 123456;
   customer1.customerName = "Dhanalakshmi";
   customer1.customerGender = 'F';
   System.out.println(customer1.customerAccountnum+" "+customer1.customerName+" "+customer1.customerGender+" "+customer1.BankName+" "+customer1.BranchName);

   SbiBank customer2 = new SbiBank();
   System.out.println(customer2.customerAccountnum+" "+customer2.customerName+" "+customer2.customerGender+" "+customer2.BankName+" "+customer2.BranchName);
   customer2.customerAccountnum = 987654;
   customer2.customerName = "Varsha";
   customer2.customerGender = 'F';
   System.out.println(customer2.customerAccountnum+" "+customer2.customerName+" "+customer2.customerGender+" "+customer2.BankName+" "+customer2.BranchName);

   SbiBank customer3 = new SbiBank();
   System.out.println(customer3.customerAccountnum+" "+customer3.customerName+" "+customer3.customerGender+" "+customer3.BankName+" "+customer3.BranchName);
   customer3.customerAccountnum = 98721;
   customer3.customerName = "Charanya";
   customer3.customerGender = 'F';
   System.out.println(customer3.customerAccountnum+" "+customer3.customerName+" "+customer3.customerGender+" "+customer3.BankName+" "+customer3.BranchName);
   
   SbiBank customer4 = new SbiBank();
   System.out.println(customer4.customerAccountnum+" "+customer4.customerName+" "+customer4.customerGender+" "+customer4.BankName+" "+customer4.BranchName);
   customer4.customerAccountnum = 546485;
   customer4.customerName = "Mahira";
   customer4.customerGender = 'F';
   System.out.println(customer4.customerAccountnum+" "+customer4.customerName+" "+customer4.customerGender+" "+customer4.BankName+" "+customer4.BranchName);

  }

}