package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		
		//File file = new File("E:\\sampleFiles\\sample1.txt");
		//FileWriter writer = null;
			//try {
			try(FileWriter writer = new FileWriter("E:\\sampleFiles\\sample3.txt", false)) {
				
			// writer = new FileWriter("E:\\sampleFiles\\sample2.txt",false);
			 writer.write(65);//it will write char into file
			 writer.write("\n");
			char[] chars = {'V', 'A', 'S', 'A', 'V', 'I'};
			writer.write(chars);
			writer.write("\n");
			writer.write("vasavi perumalla");
			writer.write("\n");
			writer.write("vasavi perumalla126");
			 writer.flush();// it will write the data into file
		     System.out.println(" data written successfully");
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} /*finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
	}


}
