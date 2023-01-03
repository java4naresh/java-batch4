package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try(FileReader fileReader = new FileReader("E:\\sampleFiles\\sample3.txt")) {
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		} catch(IOException ioe) {
			
		}
		

	}

}