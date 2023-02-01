package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		//File file = new File("C:/sampleFiles\\sample1.txt");
		//FileWriter writer = null;
		//try { 
		try (FileWriter writer = new FileWriter("C:/sampleFiles\\sample3.txt",false)) {
				//writer = new FileWriter("C:/sampleFiles\\sample3.txt",false);
			//writer = new FileWriter(file);
			 //writer.write(100);// it will write the character into file
			 //char[] chars = {'D','H','A','N','A'};
			// writer.write(chars);
			 writer.write("Dhanalakshmi Mannem");
			 writer.write("\n");
			 writer.write("Charanya Mannem");
			 writer.flush();// it will guarantee write the data into file
			 System.out.println("data written successfully");
			 
		} catch (IOException ioe) {
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
