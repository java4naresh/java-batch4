package client;

import wrapperclasses.CustomerWrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
		//CustomerWrapper cw = new CustomerWrapper();
        //System.out.println(cw);
        
        Integer num = new Integer(10);
        System.out.println(Integer.hashCode(num));//10
        Integer num1 = new Integer(100);
        Long longnum = new Long(10000);
        Float floatnum = new Float("100.00");
        Double doublenum = new Double("100.0");
        Character character = new Character('c');
        System.out.println(num);
        
        System.out.println(num.compareTo(num1));//-1
      //  System.out.println(Integer.reverse(1));
        System.out.println(longnum);
        System.out.println(floatnum);
        System.out.println(doublenum);
        System.out.println(character);         
        System.out.println(Integer.sum(20,40));//60
        System.out.println(Integer.hashCode(10));//10
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.bitCount(15));//4
        
            
        String strNumber = "100";
        int num2 = Integer.parseInt(strNumber);
        System.out.println(strNumber);
        float num3 = Float.parseFloat(strNumber);
        System.out.println(strNumber);
	    Double num4 = Double.parseDouble(strNumber);
	    System.out.println(strNumber);
	    Long num5 = Long.parseLong(strNumber);
	    System.out.println(strNumber);
	   
	    
	    Integer i = 10;// auto boxing
	    int i2 = i; //auto unboxing
	    m1(20,20.05f,222.00d,1000065L);
	    m2(new Integer(10), new Float(20.0), new Double(222.0), new Long(1000065));
	   	
	
	}
	public static void m1(Integer num2, Float num3, Double num4, Long num5) {
		System.out.println(num2+num3+num4+num5);
	}
	
	
	public static void m2(int num2, float num3, double num4, Long num5) {
		
	}
	}


