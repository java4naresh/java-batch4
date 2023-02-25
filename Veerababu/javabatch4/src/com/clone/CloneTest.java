package com.clone;

public class CloneTest implements Cloneable {
	
	int a=10;
	int b=30;
	

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneTest t1=new CloneTest();
		CloneTest t2=(CloneTest)t1.clone();
		t2.a=500;
		t2.b=1000;

		System.out.println(t1.a +"======"+t1.b);
		System.out.println(t2.a +"======"+t2.b);
	}

}
