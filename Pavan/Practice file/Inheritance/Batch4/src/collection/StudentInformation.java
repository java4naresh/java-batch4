package collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StudentInformation {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E:\\Student.txt");
		BufferedReader br = new BufferedReader(fr);
		String marksList;

		while ((marksList = br.readLine()) != null) {
			String arry[] = marksList.split(" ");
			String studentName = arry[0];
			// if(studentName=="Pavan")
			String studentSemester = arry[1];

			String studentSubjects1[] = arry[2].split("-");
			String studentSubject1 = studentSubjects1[0];
			int marks1 = Integer.parseInt(studentSubjects1[1]);

			String studentSubjects2[] = arry[3].split("-");
			String studentSubject2 = studentSubjects2[0];
			int marks2 = Integer.parseInt(studentSubjects2[1]);

			String studentSubjects3[] = arry[4].split("-");
			String studentSubject3 = studentSubjects3[0];
			int marks3 = Integer.parseInt(studentSubjects3[1]);

			String studentSubjects4[] = arry[5].split("-");
			String studentSubject4 = studentSubjects4[0];
			int marks4 = Integer.parseInt(studentSubjects4[1]);

			String studentSubjects5[] = arry[6].split("-");
			String studentSubject5 = studentSubjects5[0];
			int marks5 = Integer.parseInt(studentSubjects5[1]);

			String studentSubjects6[] = arry[7].split("-");
			String studentSubject6 = studentSubjects6[0];
			int marks6 = Integer.parseInt(studentSubjects6[1]);

			Map<String, Integer> subjectMarks = new HashMap<>();

			subjectMarks.put(studentSubject1, marks1);
			subjectMarks.put(studentSubject2, marks2);
			subjectMarks.put(studentSubject3, marks3);
			subjectMarks.put(studentSubject4, marks4);
			subjectMarks.put(studentSubject5, marks5);
			subjectMarks.put(studentSubject6, marks6);
			// System.out.println(subjectMarks);

			Map<String, Map<String, Integer>> semesterMarks = new HashMap<>();
			semesterMarks.put(studentSemester, subjectMarks);
			// System.out.println(semistarMarks);

			Map<String, Map<String, Map<String, Integer>>> studentSemesterMarks = new HashMap<>();

			studentSemesterMarks.put(studentName, semesterMarks);
			System.out.println(studentSemesterMarks);

		}

	}

}