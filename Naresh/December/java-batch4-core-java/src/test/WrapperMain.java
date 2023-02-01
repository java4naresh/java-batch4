package test;

import wrapper.CustomerWrapper;

public class WrapperMain {

	public static void main(String[] args) {
		//CustomerWrapper cw = new CustomerWrapper();
		//System.out.println(cw);
		
		Integer num = new Integer("10");
		System.out.println("hash"+num.hashCode());
		Long longNum = new Long(10000);
		Float floatNumber = new Float("10.0");
		Double doubleNumber = new Double("100.0");
		Character character = new Character('c');
		
		System.out.println(num);
		System.out.println(longNum);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(character);
		//System.out.println(Integer.reverse(145));
		System.out.println(Integer.sum(10, 20));
		String strNumber = "100";
		int num2 = Integer.parseInt(strNumber);
		float num3 = Float.parseFloat(strNumber);
        System.out.println("Naresh"+10+20);//Naresh1020
        String strNumber2 = ""+10;
        Integer i = 10;//auto boxing
        int i2 = i;//auto unboxing
        m1(10, 10.5f);
        m2(new Integer(10), new Float(10.5));
        
	}
	
	public static void m1(Integer num1, Float num2) {
		System.out.println(num1+num2);
	}
	
	public static void m2(int num1, float num2) {
		
	}

}
