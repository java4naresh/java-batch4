class CityUnionBankCustomer
{
  public static void main(String[] args)
  {
    CityUnionBank cityBank = new CityUnionBank();
    System.out.println("CityUnion Bank Personal Interest Rate: "+cityBank.getPersonalLoanInterestRate());
    System.out.println("CityUnion Bank Home Interest Rate: "+cityBank.getHomeLoanInterestRate());
    System.out.println("CityUnion Bank Business Interest Rate: "+cityBank.getBusinessLoanInterestRate());
    System.out.println("CityUnion Bank Student Interest Rate: "+cityBank.getStudentLoanInterestRate());
    System.out.println("CityUnion Bank TwoWheeler Interest Rate: "+cityBank.getTwoWheelerLoanInterestRate());
    System.out.println("CityUnion Bank GoldLoanInterestRate: "+cityBank.getGoldLoanInterestRate());
    System.out.println("CityUnion Bank SavingsAccountMinimumBalance: "+cityBank.getSavingsAccountMinimumBalance());
    System.out.println("CityUnion Bank CreditCardInterestRate: "+cityBank.getCreditCardInterestRate());
    System.out.println("CityUnion Bank InstallmentLoanInterestRate: "+cityBank.getInstallmentLoanInterestRate());

  }


}