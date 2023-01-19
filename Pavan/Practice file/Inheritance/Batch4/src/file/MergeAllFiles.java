package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeAllFiles {
/*public static void main(String[] args)  throws IOException   {
		
		File dir = new File ("D:\\Task");
		PrintWriter pw = new PrintWriter("D:\\Output.txt");
		String[]  FileNames  =  dir.list();
		for(String fileName : FileNames){
		
			File file2 = new File ("D:\\\\Task", fileName);
			
			if(file2.isFile()) { 	
				
		       System.out.println("files " +fileName);
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\Task\\" +fileName));
		String line = br.readLine();
		while(line != null) {
		   System.out.println(line);

		    pw.println(line);
		    line = br.readLine();
		   }		
			pw.flush();
		}
	}
  }*/
	public static void main(String[] args) throws IOException
    {
        // create instance of directory
        File dir = new File("D:\\Task");
        //File dir = new File("D:\\Task");
 
        // create object of PrintWriter for output file
        PrintWriter pw = new PrintWriter("output.txt");
 
        // Get list of all the files in form of String Array
        String[] fileNames = dir.list();
 
        // loop for reading the contents of all the files
        // in the directory GeeksForGeeks
        for (String fileName : fileNames) {
            System.out.println("Reading from " + fileName);
 
            // create instance of file from Name of
            // the file stored in string Array
            File f = new File(dir, fileName);
 
            // create object of BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(f));
            pw.println("Contents of file " + fileName);
 
            // Read from current file
            String line = br.readLine();
            while (line != null) {
            	 // write to the output file
                pw.println(line);
                line = br.readLine();
            }
            pw.flush();
        }
        System.out.println("Reading from all files" +
        " in directory " + dir.getName() + " Completed");
    }

            }
 



