package com.exceptionhandling.exception.Controller;

public class ArthamaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { String name="veerababu"; System.out.println(name);
		 * }catch(NullPointerException ex) { ex.printStackTrace(); } catch(Exception ex)
		 * { ex.getStackTrace(); }
		 */
		
		try {
			String name=new String(" ");
			try {
				
				if(name.isEmpty())
				{
					System.out.println("name is empty");
				}
			name.charAt(1);
			}catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			catch(StringIndexOutOfBoundsException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("====="+name);
				name.concat("veerababu");
			
			System.out.println(name);
			System.out.println(name.concat("veerababu"));

             System.out.println(name.valueOf(0));
             
			
			name.charAt(2);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
