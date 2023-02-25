package com.exceptionhandling.exception.Controller;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("veerababu");  
		
		System.out.println(sb);
		sb.append("1234");
		System.out.println(sb);
		System.out.println(sb.delete(0, 9));
		sb.setCharAt(1,'N');
		//System.out.print(sb.setCharAt(1,'N'));// i have a doubt i need to clarify with naresh bro
		
		  System.out.println(sb.capacity());//default 16 sb.append("Hello");
		  System.out.println(sb.capacity());//now 16
		  sb.append("java is my favourite language");
		  System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		  //sb.ensureCapacity(10);//now no change System.out.println(sb.capacity());//now
		   //sb.ensureCapacity(50);//now (34*2)+2
		 // System.out.println(sb.capacity());//now 70
		 	}

}
