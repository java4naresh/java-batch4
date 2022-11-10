class SortingExample
{
  public static void main(String[] args)
  {
    float amount[] = {20.1f,11.0f,25.2f,15.4f,22.3f,45.6f,5.8f};//{5.8f,11.0f,15.4f,20.1f,22.3f,25.2f,45.6f}
    
    for(int i=0; i<amount.length;i++){
    System.out.print(amount[i]+" ");
    }
    System.out.println();
    // sorting logic
    for(int i=0;i<amount.length;i++){ //0 0<6

    for(int j=i+1; j<amount.length; j++){ //1 1<6

    if(amount[i] > amount[j]){ //amount[0] > amount[1] 20.1f>11.0f
    float temp = amount[i];// temp = 20.1f;
    amount[i] = amount[j];// {11.0f,11.0f,25.2f,15.4f,22.3f,45.6f}
    amount[j] = temp;// {11.0f,20.1f,25.2f,15.4f,22.3f,45.6f} {15.4f,20.1f,22.3f,25.2f,45.6f,11.0f}
 
    }

    }
    }
    System.out.println("minimum="+ amount[0]);
    System.out.println("maximum="+ amount[amount.length -1]);

    for(int i=0; i<amount.length;i++){
    System.out.println(amount[i]+" ");
    }

  
  } 

}