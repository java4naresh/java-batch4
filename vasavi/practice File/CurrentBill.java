class CurrentBill
{
  public double current(int units,double bill)
  {
    //int units=99;
    //double bill=0;
    
   if(units<=100){
   bill=units*1.5;
   }
   else if(units<=120){
   bill=units*2;
   }
   else if(units<=150){
   bill=units*2.5;
   }
   else if(units<=200){
   bill=units*3;
   }
   else if(units>200){
   bill=units*4;
   }
   
   //System.out.println("The current bill for "+units+"is:"+bill);
   return bill;
  }
 public static void main(String[] args)
 {
   CurrentBill cu= new CurrentBill();
   double current = cu.current(99,0);
   System.out.println(current);
 }
}
   