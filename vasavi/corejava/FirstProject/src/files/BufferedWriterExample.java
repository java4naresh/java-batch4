package files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		
		try(FileWriter fileWriter = new FileWriter("E:\\sampleFiles\\sample4.txt")) {
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("vasavi perumalla");
		bufferedWriter.newLine();
		bufferedWriter.write("vasavi perumalla1");
		bufferedWriter.flush();
		System.out.println("File Content Written Success");
		} catch(IOException ioe) {
			
		}

	}

}
