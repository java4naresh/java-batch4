package serializationTask;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HDFCSerializationClient {

	public static void main(String[] args) throws IOException {
		HDFCCustomer hc = new HDFCCustomer("savings", "100000.00", "hdfc00215", "Pavan", 'M');
		FileOutputStream fos = new FileOutputStream("E:\\HDFCCustomerFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(hc);
		oos.flush();
		System.out.println("Serialization completed");

	}

}
