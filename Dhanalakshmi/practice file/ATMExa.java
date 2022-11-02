class ATMExa {

 public static void main(String[] args){

int enteredPinNumber = 1234;
int actualPinNumber = 1234;
double availableBalance = 4000;
double enteredWithdrawAmount = 3500;


if(actualPinNumber == enteredPinNumber){
  System.out.println("Welcome miss Dhana");
if(enteredWithdrawAmount <= availableBalance){
  if(enteredWithdrawAmount % 100 ==0){
  System.out.println("Please take your amount");

  System.out.println("Your available balance amount is ="+(availableBalance - enteredWithdrawAmount));
} else {
  System.out.println("Please enter 100's only");
  }

} else {
  System.out.println("Please enter lessthann available balance amount");

}
} else {
  System.out.println("Wrong PinNumber Please try again!");

}


}










}