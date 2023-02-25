package com.exceptionhandling.exception.Controller;

public class Stringloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StringBuffer sb=new StringBuffer("veerababu12345"); for(int i=0;
		 * i<sb.length();i++) { if(sb.charAt(1)) {
		 * 
		 * } }
		 */
		/*
		 * char[] name1= {'v','e','e','r','a'}; String name2=new String (name1);
		 * System.out.println(name2);
		 * 
		 * String name="veerababu";
		 * 
		 * char ch=name.charAt(0); System.out.println(ch); // int lenth =name.length();
		 * // System.out.println("string frist index of character=="+name.charAt(0)); //
		 * System.out.println("string frist index and last index of charactesr=="
		 * +"string frist index="+name.charAt(0)+" \n last index of char="+name.charAt(
		 * name.length()-1));
		 */
       String name="veerababu is good emplyee";
		/*
		 * int count=0;
		 * 
		 * for(int i=0;i<=name.length()-1;i++) { //System.out.println(name.charAt(i));
		 * if(name.charAt(i) == 'e') { count++; } } System.out.println(count);
		 */
       for(int i=0;i<=name.length()-1;i++)
       {
    	   if(i%2!=0)
    	   {
    		 System.out.println("char at ="+i+" place="+name.charAt(i));  
    	   }
       }
	}

}
