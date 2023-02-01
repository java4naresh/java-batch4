package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Merge2Files {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\sampleFiles\\sample1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		PrintWriter pw = new PrintWriter(new FileWriter("E:\\sampleFiles\\sample5.txt"));
		while(line != null) {
			System.out.println(line);
			pw.println(line);
			line = br.readLine();
		}
		FileReader fr2 = new FileReader("E:\\sampleFiles\\sample2.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		line = br2.readLine();
		while(line != null) {
			System.out.println(line);
			pw.println(line);
			line = br2.readLine();
		}
		pw.flush();

	}

}
