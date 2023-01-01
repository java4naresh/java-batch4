package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {

	public static void main(String[] args) throws InterruptedException {
		File file = new File("C:\\sampleFiles\\sample3.txt");
		try (FileReader fileReader = new FileReader(file)){
			/*int ch = fileReader.read();
			while(ch != -1) {
				System.out.println((char)ch);
				ch = fileReader.read();
			}*/
			char[] chars = new char[(int)file.length()];
			fileReader.read(chars);
			System.out.println(Arrays.toString(chars));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}

}
