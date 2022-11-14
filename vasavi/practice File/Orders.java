class Orders {
	int orderId;
	String itemName;
    int itemqty;
	int itemPrice;
	String customerName;
    int customerId;
	String vendor;

	public static void main(String[] args) {
		
		Orders orders1 = new Orders();
		System.out.println(orders1.orderId+" "+orders1.itemName+" "+orders1.itemqty+" "+orders1.itemPrice+" "+orders1.customerName+" "+orders1.vendor);
        orders1.orderId = 1;
        orders1.itemName = "Mobile";
        orders1.itemqty = 2;
   	  System.out.println(orders1.orderId+" "+orders1.itemName+" "+orders1.itemqty+" "+orders1.itemPrice+" "+orders1.customerName);
        orders1.orderId = 2;
        orders1.itemName = "Laptop";
        orders1.itemqty = 1;
        orders1.customerName="vasavi";
        orders1.itemPrice=1500000;  
   	  System.out.println(orders1.orderId+" "+orders1.itemName+" "+orders1.itemqty+" "+orders1.itemPrice+" "+orders1.customerName);
        	

     }
}
