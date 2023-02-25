package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Map<String, Map<String,Map<String, Integer>>>> studentMarks=new HashMap();
		Map<String, Map<String,Map<String, Integer>>> veerababuBetchSemmarks= new HashMap();
		Map<String,Map<String, Integer>> studentSemistars=new HashMap();
		Map<String, Integer> studentSem1subjects=new HashMap();
		studentSem1subjects.put("english", 70);
		studentSem1subjects.put("chemistry", 80);
		studentSem1subjects.put("C-languge", 70);
		Map<String, Integer> studentSem2subjects=new HashMap();
		studentSem2subjects.put("english2", 70);
		studentSem2subjects.put("chemistry2", 80);
		studentSem2subjects.put("C-languge2", 70);
		Map<String, Integer> studentSem3subjects=new HashMap();
		studentSem3subjects.put("english3", 70);
		studentSem3subjects.put("chemistry3", 80);
		studentSem3subjects.put("C-languge3", 70);
		Map<String, Integer> studentSem4subjects=new HashMap();
		studentSem4subjects.put("english4", 70);
		studentSem4subjects.put("chemistry4", 80);
		studentSem4subjects.put("C-languge4", 70);
        Map<String, Integer> studentSem5subjects=new HashMap();
		studentSem5subjects.put("english5", 70);
		studentSem5subjects.put("chemistry5", 80);
		studentSem5subjects.put("C-languge5", 70);
		Map<String, Integer> studentSem6subjects=new HashMap();
		studentSem6subjects.put("english6", 70);
		studentSem6subjects.put("chemistry6", 80);
		studentSem6subjects.put("C-languge6", 70);
		Map<String, Integer> studentSem7subjects=new HashMap();
		studentSem7subjects.put("english7", 70);
		studentSem7subjects.put("chemistry7", 80);
		studentSem7subjects.put("C-languge7", 70);
		Map<String, Integer> studentSem8subjects=new HashMap();
		studentSem8subjects.put("english8", 70);
		studentSem8subjects.put("chemistry8", 80);
		studentSem8subjects.put("C-languge8", 70);
		
		studentSemistars.put("sem1", studentSem1subjects);
		studentSemistars.put("sem2", studentSem2subjects);
		studentSemistars.put("sem3", studentSem3subjects);
		studentSemistars.put("sem4", studentSem4subjects);
		studentSemistars.put("sem5", studentSem5subjects);
		studentSemistars.put("sem6", studentSem6subjects);
		studentSemistars.put("sem7", studentSem7subjects);
		studentSemistars.put("sem8", studentSem8subjects);
		//System.out.println(studentSemistars);
		
		veerababuBetchSemmarks.put("veerababu", studentSemistars);
		veerababuBetchSemmarks.put("Nagalakshmi", studentSemistars);
		veerababuBetchSemmarks.put("Naresh", studentSemistars);
		veerababuBetchSemmarks.put("jansi", studentSemistars);
		veerababuBetchSemmarks.put("pavan", studentSemistars);
		studentMarks.put("studentList", veerababuBetchSemmarks);
		
		System.out.println(studentMarks);
		System.out.println(studentMarks.get(studentSem1subjects));
		

	}

}
