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
			//writer = new FileWriter(file);
			//writer = new FileWriter("E:\\sampleFiles\\sample3.txt", false);
			//writer.write(75);// it will write the character into file
			//char[] chars = {'N', 'A', 'R', 'E', 'S', 'H'};
			//writer.write(chars);
			writer.write("Naresh Kambala3");
			writer.write("\n");
			writer.write("Naresh Kambala4");
			writer.flush();// it will guarantee write the data into file
			System.out.println("data written successfully");
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
