package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import externalization.SBICustomer;

public class DeserializationClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File("C:\\sampleFiles\\customers.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		SBICustomer sc = (SBICustomer)ois.readObject();
        System.out.println(sc);
        
	}

}