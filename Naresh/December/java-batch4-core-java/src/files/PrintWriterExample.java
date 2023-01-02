package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
	
		try(FileWriter fileWriter = new FileWriter("E:\\sampleFiles\\sample3.txt")) {
			PrintWriter pw = new PrintWriter(fileWriter);
			pw.println(true);
			pw.println(10.2);
			pw.println(10.0f);
			pw.flush();
			System.out.println("Data inserted into file using print writer");
		}  catch(IOException ioe) {
			
		}

	}

}
