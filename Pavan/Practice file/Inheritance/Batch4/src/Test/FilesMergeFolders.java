package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

public class FilesMergeFolders {
	
		public static void main(String[] args) throws IOException
		{
			File dir = new File("D:\\Task");
			PrintWriter pw = new PrintWriter("D:\\Output.txt");
			String[] fileNames = dir.list();
			for(String fileName : fileNames) {
				File file = new File("D:\\Task", fileName);
				if(file.isFile()) {
					System.out.println("files"+ fileName);
					BufferedReader br = new BufferedReader(new FileReader("D:\\Task\\" + fileName));
					String line = br.readLine();
					while(line != null) {
						pw.println(line);
						line = br.readLine();
					}
					pw.flush();
				} else if(file.isDirectory()) {
					String[] fileNames2 = file.list();
					for(String fileName2 : fileNames2) {
						File file1 = new File("D:\\Task\\" + fileName, fileName2);
						if(file1.isFile()) {
							System.out.println("files"+ fileName);
							BufferedReader br = new BufferedReader(new FileReader("D:\\Task\\" + fileName + "\\" + fileName2));
							String line = br.readLine();
							while(line != null) {
								pw.println(line);
								line = br.readLine();
							}
							pw.flush();
						}
					}
					
				}
			}
		}
}

