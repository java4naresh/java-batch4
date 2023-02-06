package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClient {

	public static void main(String[] args) throws IOException {
		//serialization
		//HDFCCustomer hc = new HDFCCustomer("hdfc123", "Dhanu", "Dhanu123");
		HDFBankCustomer hbc = new HDFBankCustomer("Savings,Current");
		FileOutputStream fos = new FileOutputStream(new File("C:\\sampleFiles\\customers.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hbc);
		oos.flush();
		System.out.println("Serialization is completed");
		
		

	}

}