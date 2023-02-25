package com.clone;

public class Student implements Cloneable {
	Emplyee emp;
	int id;
	
	 public Student(Emplyee emp,int id)
	{
		this.emp=emp;
		this.id=id;
	}
	
	

	public Object clone() throws CloneNotSupportedException
	{
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.clone();
	}

}
