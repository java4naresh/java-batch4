package tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFiles {
	
	public static void main(String[] args)  throws IOException   {
	
		File dir = new File ("C:\\sampleFiles");
		PrintWriter pw = new PrintWriter("C:\\Output.txt");
		String[]  FileNames  =  dir.list();
		for(String fileName : FileNames){
		
			File file2 = new File ("C:\\sampleFiles", fileName);
			
			if(file2.isFile() ) {	   
		System.out.println("files " +fileName);
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\sampleFiles\\" +fileName));

		String line = br.readLine();
		while(line != null) {
		   //System.out.println(line);

		    pw.println(line);
		    line = br.readLine();
		   }
			
			pw.flush();
		}
	  }
	}
}
