class CurrentBill {

  public static void main(String[] args) {
  
    int units = 80;
    double bill = 0;
    
   if(units<=100){
   bill = units*1.5;
   }

   else if(units<=120){
   bill = units*2;
   }

   else if(units<=150){
   bill = units*2.5;
   }

   else if(units<=200){
   bill = units*3;
   }

   else if(units>200){
   bill = units*4;
   }

  System.out.println("The current bill for "+units+"is:"+bill);
  }
}
   