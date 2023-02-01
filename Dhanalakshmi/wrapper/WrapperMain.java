package wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		CustomerWrapper cw = new CustomerWrapper();
        System.out.println(cw);
        
        Integer num = new Integer("10");
        Long longNum = new Long(50000);
        Float floatNumber = new Float(9.0);
        Double doubleNumber = new Double(100.0);
        Character character = new Character('D');
        
        
        System.out.println(num);
        System.out.println(longNum);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(character);
        System.out.println(num.equals(character));
        System.out.println(Integer.sum(10, 30));
        System.out.println(Integer.hashCode(1));
        String strNumber = "100";
        int num2 = Integer.parseInt(strNumber);
        float num3 = Float.parseFloat(strNumber);
        long num4 = Long.parseLong(strNumber);
       // double num5 = Double.parseDouble(strNumber)
        System.out.println("Dhana"+10+20);//Dhana1020
        String strNumber2 = ""+10;
        Integer i = 10;//auto boxing
        int i2 = i;// auto unboxing
        m1(10,10.5f);
        m2(new Integer(10),new Float(10.5));
       
	}
	
	public static void m1(Integer num1,Float num2) {
		
		System.out.println(num1+num2);
	}
	
	public static void m2(int num1,float num2) {
		System.out.println(num1+num2);

	}
	
	 
}
