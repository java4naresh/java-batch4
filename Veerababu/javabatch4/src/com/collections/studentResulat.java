package com.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class studentResulat {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\veeru\\Documents\\Student.txt");
		BufferedReader br = new BufferedReader(fr);
//System.out.println(br);
		String marksList;

		while ((marksList = br.readLine()) != null) {
			String arry[] = marksList.split(" ");
			String studentName = arry[0];
			//if(studentName=="Naresh") 
			String studentSemistar = arry[1];
			
			String studentsubjects[] = arry[2].split("-");
			String StudentSubject1 = studentsubjects[0];
			int marks1 = Integer.parseInt(studentsubjects[1]);
			
			String studentsubjects2[] = arry[3].split("-");
			String StudentSubject2 = studentsubjects2[0];
			int marks2 = Integer.parseInt(studentsubjects2[1]);
			
			String studentsubjects3[] = arry[4].split("-");
			String StudentSubject3 = studentsubjects3[0];
			int marks3 = Integer.parseInt(studentsubjects3[1]);
			
			String studentsubjects4[] = arry[5].split("-");
			String StudentSubject4 = studentsubjects4[0];
			int marks4 = Integer.parseInt(studentsubjects4[1]);
			
			String studentsubjects5[] = arry[6].split("-");
			String StudentSubject5 = studentsubjects5[0];
			int marks5 = Integer.parseInt(studentsubjects5[1]);
			
			String studentsubjects6[] = arry[7].split("-");
			String StudentSubject6 = studentsubjects6[0];
			int marks6 = Integer.parseInt(studentsubjects6[1]);
			
			Map<String, Integer>subjectMarks=new HashMap();
			
			subjectMarks.put(StudentSubject1, marks1);
			subjectMarks.put(StudentSubject2, marks2);
			subjectMarks.put(StudentSubject3, marks3);
			subjectMarks.put(StudentSubject4, marks4);
			subjectMarks.put(StudentSubject5, marks5);
			subjectMarks.put(StudentSubject6, marks6);
			//System.out.println(subjectMarks);
			
			Map<String,Map<String, Integer>>semistarMarks=new HashMap();
			semistarMarks.put(studentSemistar, subjectMarks); 
			//System.out.println(semistarMarks);
			
			Map<String ,Map<String,Map<String, Integer>>>studentsemistarrMarks=new HashMap();
			
			studentsemistarrMarks.put(studentName, semistarMarks);
			System.out.println(studentsemistarrMarks);
			
			//studentsemistarrMarks.get("naresh");
			//System.out.println(studentsemistarrMarks.get("Naresh"));
			//System.out.println(studentName+" "+studentSemistar+" "+subjectMarks);
				//System.out.println(subjectMarks.get(0)+" "+subjectMarks.get(1)+" "+subjectMarks.get(2)+" "+subjectMarks.get(3)+" +"+subjectMarks.get(4)+" "+subjectMarks.get(5)+" "+subjectMarks.get(6));
		}
	}

}
