package com.clone;

public class Salowcoling {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emplyee emp=new Emplyee("veerababu");
		Student s1=new Student(emp,123);
		
		Student s2=(Student)s1.clone();
		System.out.println(s1.id+"===="+s1.emp.name);
		System.out.println(s2.id+"===="+s2.emp.name);
		s2.id=22222;
		s2.emp.name="Naresh";
		System.out.println(s1.id+"===="+s1.emp.name);
		System.out.println(s2.id+"===="+s2.emp.name);
		
	}

}
