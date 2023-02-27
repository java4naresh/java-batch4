package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
	
public class StudentDataTask{
			
		    public static void main(String[] args) throws IOException {
		    	
		    	 FileReader fr = new FileReader("E:\\StudentData.txt");
		         BufferedReader br = new BufferedReader(fr);
		         String marksList;

		         Map<String, Map<String, Map<String, Integer>>> studentSemisterMarks = new HashMap<>();

		         while ((marksList = br.readLine()) != null) {
		             String[] arry = marksList.split("\\s+"); // split by any whitespace character
		             String name = arry[0];
		             String semister = arry[1];
		             Map<String, Integer> marks = new HashMap<>();
		             for (int i = 2; i < arry.length; i++) {
		                 String[] subjectMarks = arry[i].split("-");
		                 String subject = subjectMarks[0];
		                 int mark = Integer.parseInt(subjectMarks[1]);
		                 marks.put(subject, mark);
		             }
		             Map<String, Map<String, Integer>> studentMarks = studentSemisterMarks.get(name);
		             if (studentMarks == null) {
		                 studentMarks = new HashMap<>();
		                 studentSemisterMarks.put(name, studentMarks);
		             }
		             studentMarks.put(semister, marks);
		         }

		         System.out.println(studentSemisterMarks);

		         //br.close();
		         //fr.close();
		     }
		 }