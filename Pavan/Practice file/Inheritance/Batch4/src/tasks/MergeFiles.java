package tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFiles {
	public static void main(String[] args) throws IOException {

		File dir = new File("D:\\Task");
		try (PrintWriter pw = new PrintWriter("D:\\Task1\\Output.txt")) {
			String[] fileNames = dir.list();
			for (String fileName : fileNames) {
				System.out.println("Reading from " + fileName);
				File f = new File(dir, fileName);
				try (BufferedReader br = new BufferedReader(new FileReader(f))) {
					pw.println("Contents of file " + fileName);
					String line = br.readLine();
					while (line != null) {
						pw.println(line);
					    line = br.readLine();
					}
					File dir1 = new File("D:\\Task1");
					String[] fileNames1 = dir1.list();
					for (String fileName1 : fileNames1) {
						System.out.println("Reading from " + fileName1);
						File f1 = new File(dir1, fileName1);
						try (BufferedReader br1 = new BufferedReader(new FileReader(f1))) {
							pw.println("Contents of file " + fileName1);
							String line1 = br1.readLine();
							while (line1 != null) {
								pw.println(line1);
							    line1 = br1.readLine();
							}
							pw.flush();
							
					}
						
				}
					
			}
			
		}
	}

}
}
