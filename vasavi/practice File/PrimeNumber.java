class PrimeNumber{
  public static void main(String[] args){
   
   for(int i=1;i<=100;i++){
     int num=i;
     int flag=1;
   for(i=2; i<num;i++){
     if(num%i==0){
       flag=0;
       break;
     }
    }  
  System.out.println((flag!=1)? "Notprime"  : "prime");
  } 
    
  }
}