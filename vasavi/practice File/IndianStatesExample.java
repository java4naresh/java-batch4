class IndianStatesExample{
 
 String stateName;
 String countryName;
 String chiefMinister;
 long totalPopulation;
  public IndianStatesExample(){// default constructor or no param constructor
     System.out.println("no param constructor called");
 }
  public IndianStatesExample(String state,String country,String CM,long population)//parameterized constructor
  {
    stateName= state;
    countryName=country;
    chiefMinister= CM;
    totalPopulation=population;
  } 
  public IndianStatesExample(String state,String country,String CM,long population,String I)
  {
    

  }
 
   public static void main(String[] args){
   IndianStatesExample state=new IndianStatesExample();
     state.stateName="Telagana";
    state.countryName=" India";
    state.chiefMinister= " kcr";
    state.totalPopulation= 10000234;
   System.out.println(state.stateName+" "+ state.countryName+" "+state.chiefMinister+" "+state.totalPopulation);
    state.stateName="Andhra Pradesh";
    state.countryName=" India";
    state.chiefMinister= " jagan";
    state.totalPopulation= 1000023;
   
  System.out.println(state.stateName+" "+ state.countryName+" "+state.chiefMinister+" "+state.totalPopulation );

  }

}