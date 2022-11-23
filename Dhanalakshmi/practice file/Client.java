class Client 
{
   public static void main(String[] args) 
   {
    
    Arithmetic art = new Arithmetic();
    System.out.println(art.sum(20,30));
    System.out.println(art.sub(30,20));
    System.out.println(art.mul(30,20));
    System.out.println(art.div(30,20));

   }
   
    public String getInformation() {
    String info = "Name:Charanya, Age:2, Gender:Female";
    return info;
    }

}   